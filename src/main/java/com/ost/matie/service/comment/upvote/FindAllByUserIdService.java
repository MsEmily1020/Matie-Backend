package com.ost.matie.service.comment.upvote;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.dto.comment.upvote.UpvoteResponse;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.comment.upvote.UpvoteRepository;
import com.ost.matie.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@TransactionalService
@RequiredArgsConstructor
public class FindAllByUserIdService {
    private final UpvoteRepository upvoteRepository;
    private final UserRepository userRepository;

    public List<UpvoteResponse> execute(Long userId) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;

        List<UpvoteResponse> upvotes = upvoteRepository.findAllByUserId(userId)
                .stream()
                .map(UpvoteResponse::new)
                .toList();

        return upvotes;
    }
}

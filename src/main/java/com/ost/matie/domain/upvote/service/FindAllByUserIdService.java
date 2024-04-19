package com.ost.matie.domain.upvote.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.upvote.dto.UpvoteResponse;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.upvote.repository.UpvoteRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ReadOnlyService
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

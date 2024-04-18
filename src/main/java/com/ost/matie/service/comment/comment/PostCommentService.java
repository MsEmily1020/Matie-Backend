package com.ost.matie.service.comment.comment;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.dto.comment.comment.AddCommentRequest;
import com.ost.matie.exception.CommunityNotFoundException;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.comment.comment.CommentRepository;
import com.ost.matie.repository.community.CommunityRepository;
import com.ost.matie.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class PostCommentService {
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private final CommunityRepository communityRepository;

    public void execute(AddCommentRequest request) {
        if(!userRepository.existsById(request.getUser().getId())) throw UserNotFoundException.EXCEPTION;
        if(!communityRepository.existsById(request.getCommunity().getId())) throw CommunityNotFoundException.EXCEPTION;

        commentRepository.save(request.toEntity());
    }
}

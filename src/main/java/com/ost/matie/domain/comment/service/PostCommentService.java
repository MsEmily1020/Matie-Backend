package com.ost.matie.domain.comment.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.comment.dto.AddCommentRequest;
import com.ost.matie.domain.community.exception.CommunityNotFoundException;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.comment.repository.CommentRepository;
import com.ost.matie.domain.community.repository.CommunityRepository;
import com.ost.matie.domain.user.repository.UserRepository;
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

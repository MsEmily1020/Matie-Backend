package com.ost.matie.domain.upvote.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.upvote.dto.AddUpvoteRequest;
import com.ost.matie.domain.comment.exception.CommentNotFoundException;
import com.ost.matie.domain.upvote.exception.UpvoteDuplicateException;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.comment.repository.CommentRepository;
import com.ost.matie.domain.upvote.repository.UpvoteRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class PostUpvoteService {
    private final UpvoteRepository upvoteRepository;
    private final UserRepository userRepository;
    private final CommentRepository commentRepository;

    public void execute(AddUpvoteRequest request) {
        if(upvoteRepository.existsByUserIdAndCommentId(request.getUser().getId(), request.getComment().getId())) throw UpvoteDuplicateException.EXCEPTION;
        if(!userRepository.existsById(request.getUser().getId())) throw UserNotFoundException.EXCEPTION;
        if(!commentRepository.existsById(request.getComment().getId())) throw CommentNotFoundException.EXCEPTION;

        upvoteRepository.save(request.toEntity());
    }
}

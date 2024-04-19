package com.ost.matie.domain.upvote.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.upvote.dto.UpvoteResponse;
import com.ost.matie.domain.comment.exception.CommentNotFoundException;
import com.ost.matie.domain.upvote.exception.UpvoteNotFoundException;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.comment.repository.CommentRepository;
import com.ost.matie.domain.upvote.repository.UpvoteRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@ReadOnlyService
@RequiredArgsConstructor
public class FindByUserIdAndCommentIdService {
    private final UpvoteRepository upvoteRepository;
    private final UserRepository userRepository;
    private final CommentRepository commentRepository;

    public UpvoteResponse execute(Long userId, Long commentId) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;
        if(!commentRepository.existsById(commentId)) throw CommentNotFoundException.EXCEPTION;
        if(!upvoteRepository.existsByUserIdAndCommentId(userId, commentId)) throw UpvoteNotFoundException.EXCEPTION;

        return new UpvoteResponse(upvoteRepository.findByUserIdAndCommentId(userId, commentId));
    }
}

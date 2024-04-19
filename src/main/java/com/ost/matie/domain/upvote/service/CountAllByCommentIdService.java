package com.ost.matie.domain.upvote.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.comment.exception.CommentNotFoundException;
import com.ost.matie.domain.comment.repository.CommentRepository;
import com.ost.matie.domain.upvote.repository.UpvoteRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class CountAllByCommentIdService {
    private final UpvoteRepository upvoteRepository;
    private final CommentRepository commentRepository;

    public Long execute(Long commentId) {
        if(!commentRepository.existsById(commentId)) throw CommentNotFoundException.EXCEPTION;
        return upvoteRepository.countAllByCommentId(commentId);
    }
}

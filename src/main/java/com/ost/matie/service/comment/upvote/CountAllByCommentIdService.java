package com.ost.matie.service.comment.upvote;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.exception.CommentNotFoundException;
import com.ost.matie.repository.comment.comment.CommentRepository;
import com.ost.matie.repository.comment.upvote.UpvoteRepository;
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

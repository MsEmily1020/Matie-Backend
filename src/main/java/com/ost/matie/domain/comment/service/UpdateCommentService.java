package com.ost.matie.domain.comment.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.comment.dto.UpdateCommentRequest;
import com.ost.matie.domain.comment.exception.CommentNotFoundException;
import com.ost.matie.domain.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class UpdateCommentService {
    private final CommentRepository commentRepository;

    public void execute(Long id, UpdateCommentRequest request) {
        Comment comment = commentRepository.findById(id)
                .orElseThrow(() -> CommentNotFoundException.EXCEPTION);

        comment.update(request.getDescription());
    }
}

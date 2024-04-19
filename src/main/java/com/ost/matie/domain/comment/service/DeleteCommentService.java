package com.ost.matie.domain.comment.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.comment.exception.CommentNotFoundException;
import com.ost.matie.domain.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class DeleteCommentService {
    private final CommentRepository commentRepository;

    public void execute(Long id) {
        if(!commentRepository.existsById(id)) throw CommentNotFoundException.EXCEPTION;
        commentRepository.deleteById(id);
    }
}

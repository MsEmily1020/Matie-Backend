package com.ost.matie.service.comment.comment;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.exception.CommentNotFoundException;
import com.ost.matie.repository.comment.comment.CommentRepository;
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

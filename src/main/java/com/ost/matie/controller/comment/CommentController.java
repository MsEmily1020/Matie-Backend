package com.ost.matie.controller.comment;

import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.point.Point;
import com.ost.matie.dto.comment.AddCommentRequest;
import com.ost.matie.dto.point.AddPointRequest;
import com.ost.matie.service.comment.CommentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/comment")
    public ResponseEntity<Comment> addComment(@Valid @RequestBody AddCommentRequest request) {
        Comment comment = commentService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(comment);
    }
}

package com.ost.matie.controller.comment;

import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.point.Point;
import com.ost.matie.dto.comment.AddCommentRequest;
import com.ost.matie.dto.comment.CommentResponse;
import com.ost.matie.dto.comment.UpdateCommentRequest;
import com.ost.matie.dto.community.UpdateCommunityRequest;
import com.ost.matie.dto.point.AddPointRequest;
import com.ost.matie.dto.point.PointResponse;
import com.ost.matie.dto.team.TeamResponse;
import com.ost.matie.service.comment.CommentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/comment/{communityId}")
    public ResponseEntity<List<CommentResponse>> findAllByCommunityId(@PathVariable Long communityId) {
        List<CommentResponse> commentResponses = commentService.findAllByCommunityId(communityId)
                .stream()
                .map(CommentResponse::new)
                .toList();

        return ResponseEntity.ok().body(commentResponses);
    }

    @PutMapping("/comment/{id}")
    public ResponseEntity<Comment> updateComment(@PathVariable Long id,
                                                     @Valid @RequestBody UpdateCommentRequest request) {
        Comment comment = commentService.update(id, request);
        return ResponseEntity.ok().body(comment);
    }
}

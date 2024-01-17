package com.ost.matie.controller.comment;

import com.ost.matie.domain.comment.Comment;
import com.ost.matie.dto.comment.AddCommentRequest;
import com.ost.matie.dto.comment.CommentResponse;
import com.ost.matie.dto.comment.UpdateCommentRequest;
import com.ost.matie.service.comment.CommentService;
import com.ost.matie.service.community.CommunityService;
import com.ost.matie.service.user.UserService;
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
    private final UserService userService;
    private final CommunityService communityService;

    @PostMapping("/comment")
    public ResponseEntity<CommentResponse> addComment(@Valid @RequestBody AddCommentRequest request) {
        userService.findById(request.getUser().getId());
        communityService.findById(request.getCommunity().getId());
        Comment comment = commentService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new CommentResponse(comment));
    }

    @GetMapping("/comment/{communityId}")
    public ResponseEntity<List<CommentResponse>> findAllByCommunityId(@PathVariable Long communityId) {
        communityService.findById(communityId);

        List<CommentResponse> commentResponses = commentService.findAllByCommunityId(communityId)
                .stream()
                .map(CommentResponse::new)
                .toList();

        return ResponseEntity.ok().body(commentResponses);
    }

    @PutMapping("/comment/{id}")
    public ResponseEntity<CommentResponse> updateComment(@PathVariable Long id,
                                                     @Valid @RequestBody UpdateCommentRequest request) {
        Comment comment = commentService.update(id, request);
        return ResponseEntity.ok().body(new CommentResponse(comment));
    }

    @DeleteMapping("/comment/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long id) {
        commentService.delete(id);
        return ResponseEntity.ok().build();
    }
}

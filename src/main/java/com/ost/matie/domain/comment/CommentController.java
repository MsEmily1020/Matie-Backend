package com.ost.matie.domain.comment;

import com.ost.matie.domain.comment.dto.AddCommentRequest;
import com.ost.matie.domain.comment.dto.CommentResponse;
import com.ost.matie.domain.comment.dto.UpdateCommentRequest;
import com.ost.matie.domain.comment.service.PostCommentService;
import com.ost.matie.domain.comment.service.DeleteCommentService;
import com.ost.matie.domain.comment.service.FindAllByCommunityIdService;
import com.ost.matie.domain.comment.service.UpdateCommentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/comment")
public class CommentController {
    private final PostCommentService postCommentService;
    private final FindAllByCommunityIdService findAllByCommunityIdService;
    private final UpdateCommentService updateCommentService;
    private final DeleteCommentService deleteCommentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addComment(@Valid @RequestBody AddCommentRequest request) {
        postCommentService.execute(request);
    }

    @GetMapping("/{communityId}")
    public List<CommentResponse> findAllByCommunityId(@PathVariable Long communityId) {
        return findAllByCommunityIdService.execute(communityId);
    }

    @PutMapping("/{id}")
    public void updateComment(@PathVariable Long id, @Valid @RequestBody UpdateCommentRequest request) {
        updateCommentService.execute(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        deleteCommentService.execute(id);
    }
}

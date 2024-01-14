package com.ost.matie.controller.clear;

import com.ost.matie.dto.clear.ClearResponse;
import com.ost.matie.dto.comment.CommentResponse;
import com.ost.matie.service.clear.ClearService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ClearController {
    private final ClearService clearService;

    @GetMapping("/clear/{userId}")
    public ResponseEntity<List<ClearResponse>> findAllByUserId(@PathVariable Long userId) {
        List<ClearResponse> commentResponses = clearService.findAllByUserId(userId)
                .stream()
                .map(ClearResponse::new)
                .toList();

        return ResponseEntity.ok().body(commentResponses);
    }
}

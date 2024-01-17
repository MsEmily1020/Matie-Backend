package com.ost.matie.controller.clear;

import com.ost.matie.domain.clear.Clear;
import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.walk.Walk;
import com.ost.matie.dto.clear.AddClearRequest;
import com.ost.matie.dto.clear.ClearResponse;
import com.ost.matie.dto.clear.UpdateClearRequest;
import com.ost.matie.dto.comment.AddCommentRequest;
import com.ost.matie.dto.comment.CommentResponse;
import com.ost.matie.dto.walk.UpdateWalkRequest;
import com.ost.matie.service.clear.ClearService;
import com.ost.matie.service.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ClearController {
    private final ClearService clearService;
    private final UserService userService;

    @PostMapping("/clear")
    public ResponseEntity<ClearResponse> addClear(@Valid @RequestBody AddClearRequest request) {
        userService.findById(request.getUser().getId());
        Clear clear = clearService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ClearResponse(clear));
    }

    @GetMapping("/clear/{userId}")
    public ResponseEntity<List<ClearResponse>> findAllByUserId(@PathVariable Long userId) {
        List<ClearResponse> clearResponses = clearService.findAllByUserId(userId)
                .stream()
                .map(ClearResponse::new)
                .toList();

        return ResponseEntity.ok().body(clearResponses);
    }

    @GetMapping("/clear/day/{userId}")
    public ResponseEntity<List<ClearResponse>> findDay7ByUserId(@PathVariable Long userId) {
        List<ClearResponse> clearResponses = clearService.findAllSevenDays(userId)
                .stream()
                .map(ClearResponse::new)
                .toList();

        return ResponseEntity.ok().body(clearResponses);
    }

    @PutMapping("/clear/{userId}/{date}")
    public ResponseEntity<ClearResponse> updateClear(@PathVariable Long userId,
                                             @PathVariable LocalDate date,
                                             @RequestBody UpdateClearRequest request) {
        Clear clear = clearService.update(userId, date, request);
        return ResponseEntity.ok().body(new ClearResponse(clear));
    }
}

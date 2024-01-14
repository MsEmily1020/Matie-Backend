package com.ost.matie.controller.walk;

import com.ost.matie.domain.user.Users;
import com.ost.matie.domain.walk.Walk;
import com.ost.matie.dto.user.AddUserRequest;
import com.ost.matie.dto.user.UserResponse;
import com.ost.matie.dto.walk.AddWalkRequest;
import com.ost.matie.dto.walk.WalkResponse;
import com.ost.matie.service.walk.WalkService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class WalkController {
    private final WalkService walkService;

    @PostMapping("/walk")
    public ResponseEntity<Walk> addWalk(@Valid @RequestBody AddWalkRequest request) {
        Walk walk = walkService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(walk);
    }

    @GetMapping("/walk/{userId}")
    public ResponseEntity<List<WalkResponse>> findAllByUserId(@PathVariable Long userId) {
        List<WalkResponse> walkResponses = walkService.findAllByUserId(userId)
                .stream()
                .map(WalkResponse::new)
                .toList();

        return ResponseEntity.ok().body(walkResponses);
    }
}

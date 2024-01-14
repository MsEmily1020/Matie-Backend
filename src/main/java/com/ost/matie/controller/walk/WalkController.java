package com.ost.matie.controller.walk;

import com.ost.matie.domain.user.Users;
import com.ost.matie.domain.walk.Walk;
import com.ost.matie.dto.user.AddUserRequest;
import com.ost.matie.dto.walk.AddWalkRequest;
import com.ost.matie.service.walk.WalkService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}

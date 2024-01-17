package com.ost.matie.controller.walk;

import com.ost.matie.domain.user.Users;
import com.ost.matie.domain.walk.Walk;
import com.ost.matie.dto.user.UpdateUserRequest;
import com.ost.matie.dto.walk.AddWalkRequest;
import com.ost.matie.dto.walk.UpdateWalkRequest;
import com.ost.matie.dto.walk.WalkResponse;
import com.ost.matie.service.user.UserService;
import com.ost.matie.service.walk.WalkService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class WalkController {
    private final WalkService walkService;
    private final UserService userService;

    @PostMapping("/walk")
    public ResponseEntity<WalkResponse> addWalk(@Valid @RequestBody AddWalkRequest request) {
        userService.findById(request.getUser().getId());
        Walk walk = walkService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new WalkResponse(walk));
    }

    @GetMapping("/walk/{userId}")
    public ResponseEntity<List<WalkResponse>> findAllByUserId(@PathVariable Long userId) {
        userService.findById(userId);
        List<WalkResponse> walkResponses = walkService.findAllByUserId(userId)
                .stream()
                .map(WalkResponse::new)
                .toList();

        return ResponseEntity.ok().body(walkResponses);
    }

    @GetMapping("/walk/day/{userId}")
    public ResponseEntity<List<WalkResponse>> findDay7ByUserId(@PathVariable Long userId) {
        userService.findById(userId);

        List<WalkResponse> walkResponses = walkService.findAllSevenDays(userId)
                .stream()
                .map(WalkResponse::new)
                .toList();

        return ResponseEntity.ok().body(walkResponses);
    }

    @GetMapping("/walk/{userId}/{date}")
    public ResponseEntity<WalkResponse> findFirstByUserIdAndDateOrderByDateDesc(@PathVariable(name = "userId") Long userId, @PathVariable(name = "date") LocalDate date) {
        userService.findById(userId);
        Walk walk = walkService.findFirstByUserIdAndDateOrderByDateDesc(userId, date);
        return ResponseEntity.ok()
                .body(new WalkResponse(walk));
    }

    @PutMapping("/walk/{userId}/{date}")
    public ResponseEntity<WalkResponse> updateWalk(@PathVariable Long userId,
                                           @PathVariable LocalDate date,
                                           @RequestBody UpdateWalkRequest request) {
        userService.findById(userId);
        Walk walk = walkService.update(userId, date, request);
        return ResponseEntity.ok().body(new WalkResponse(walk));
    }
}

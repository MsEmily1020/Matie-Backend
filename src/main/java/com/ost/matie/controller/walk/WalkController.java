package com.ost.matie.controller.walk;

import com.ost.matie.domain.walk.Walk;
import com.ost.matie.dto.walk.AddWalkRequest;
import com.ost.matie.dto.walk.WalkResponse;
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

    @GetMapping("/walk/{userId}/{date}")
    public ResponseEntity<WalkResponse> findFirstByUserIdAndDateOrderByDateDesc(@PathVariable(name = "userId") Long userId, @PathVariable(name = "date") LocalDate date) {
        Walk walk = walkService.findFirstByUserIdAndDateOrderByDateDesc(userId, date);
        return ResponseEntity.ok()
                .body(new WalkResponse(walk));
    }
}

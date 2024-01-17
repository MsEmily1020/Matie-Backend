package com.ost.matie.controller.point;

import com.ost.matie.domain.point.Point;
import com.ost.matie.dto.point.AddPointRequest;
import com.ost.matie.dto.point.PointResponse;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.service.point.PointService;
import com.ost.matie.service.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PointController {
    private final PointService pointService;
    private final UserService userService;

    @PostMapping("/point")
    public ResponseEntity<PointResponse> addPoint(@Valid @RequestBody AddPointRequest request) {
        userService.findById(request.getUser().getId());
        Point point = pointService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new PointResponse(point));
    }

    @GetMapping("/point/{userId}")
    public ResponseEntity<PointResponse> findFirstByUserIdOrderByCreatedDateDesc(@PathVariable Long userId) {
        Point point = pointService.findFirstByUserIdOrderByCreatedDateDesc(userId);
        return ResponseEntity.ok().body(new PointResponse(point));
    }
}

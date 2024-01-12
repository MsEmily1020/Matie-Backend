package com.ost.matie.controller.point;

import com.ost.matie.domain.point.Point;
import com.ost.matie.dto.point.AddPointRequest;
import com.ost.matie.dto.point.PointResponse;
import com.ost.matie.service.point.PointService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PointController {
    private final PointService pointService;

    @PostMapping("/point")
    public ResponseEntity<Point> addPoint(@Valid @RequestBody AddPointRequest request) {
        Point point = pointService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(point);
    }

    @GetMapping("/point/{userId}")
    public ResponseEntity<PointResponse> findFirstByUserIdOrderByCreatedDateDesc(@PathVariable Long userId) {
        Point point = pointService.findFirstByUserIdOrderByCreatedDateDesc(userId);
        return ResponseEntity.ok().body(new PointResponse(point));
    }
}

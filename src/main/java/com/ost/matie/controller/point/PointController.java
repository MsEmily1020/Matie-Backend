package com.ost.matie.controller.point;

import com.ost.matie.dto.point.AddPointRequest;
import com.ost.matie.dto.point.PointResponse;
import com.ost.matie.service.point.PostPointService;
import com.ost.matie.service.point.FindByUserIdPointService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/point")
public class PointController {
    private final PostPointService postPointService;
    private final FindByUserIdPointService findByUserIdPointService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addPoint(@Valid @RequestBody AddPointRequest request) {
        postPointService.execute(request);
    }

    @GetMapping("/{userId}")
    public PointResponse findFirstByUserIdOrderByCreatedDateDesc(@PathVariable Long userId) {
        return findByUserIdPointService.execute(userId);
    }
}

package com.ost.matie.domain.point;

import com.ost.matie.domain.point.dto.AddPointRequest;
import com.ost.matie.domain.point.dto.PointResponse;
import com.ost.matie.domain.point.service.PostPointService;
import com.ost.matie.domain.point.service.FindByUserIdPointService;
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

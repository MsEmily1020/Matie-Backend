package com.ost.matie.domain.clear;

import com.ost.matie.domain.clear.dto.AddClearRequest;
import com.ost.matie.domain.clear.dto.ClearResponse;
import com.ost.matie.domain.clear.service.PostClearService;
import com.ost.matie.domain.clear.service.FindByUserIdService;
import com.ost.matie.domain.clear.service.FindDay7ByUserIdService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clear")
public class ClearController {
    private final PostClearService postClearService;
    private final FindDay7ByUserIdService findDay7ByUserIdService;
    private final FindByUserIdService findByUserIdService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addClear(@Valid @RequestBody AddClearRequest request) {
        postClearService.execute(request);
    }

    @GetMapping("/day/{userId}")
    public List<ClearResponse> findDay7ByUserId(@PathVariable Long userId) {
        return findDay7ByUserIdService.execute(userId);
    }

    @GetMapping("/{userId}")
    public List<ClearResponse> findByUserId(@PathVariable Long userId) {
        return findByUserIdService.execute(userId);
    }
}

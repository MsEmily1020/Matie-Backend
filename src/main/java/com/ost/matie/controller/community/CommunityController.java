package com.ost.matie.controller.community;

import com.ost.matie.dto.community.AddCommunityRequest;
import com.ost.matie.dto.community.CommunityResponse;
import com.ost.matie.dto.community.UpdateCommunityRequest;
import com.ost.matie.service.community.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/community")
public class CommunityController {
    private final AddCommunityService addCommunityService;
    private final FindByTypeOrderByDateDescService findByTypeOrderByDateDescService;
    private final FIndCommunityService findCommunityService;
    private final UpdateCommunityService updateCommunityService;
    private final DeleteCommunityService deleteCommunityService;

    @PostMapping
    public void addCommunity(@Valid @RequestBody AddCommunityRequest request) {
        addCommunityService.execute(request);
    }

    @GetMapping("/type/{typeName}")
    public List<CommunityResponse> findByTypeOrderByDateDesc(@PathVariable String typeName) {
        return findByTypeOrderByDateDescService.execute(typeName);
    }

    @GetMapping("/{id}")
    public CommunityResponse findCommunity(@PathVariable Long id) {
        return findCommunityService.execute(id);
    }

    @PutMapping("/{id}")
    public void updateCommunity(@PathVariable Long id,
                                @Valid @RequestBody UpdateCommunityRequest request) {
        updateCommunityService.execute(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteCommunity(@PathVariable Long id) {
        deleteCommunityService.execute(id);
    }
}

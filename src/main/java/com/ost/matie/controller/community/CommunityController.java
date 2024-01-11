package com.ost.matie.controller.community;

import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.point.Point;
import com.ost.matie.dto.community.AddCommunityRequest;
import com.ost.matie.dto.point.AddPointRequest;
import com.ost.matie.service.community.CommunityService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CommunityController {
    private final CommunityService communityService;

    @PostMapping("/community")
    public ResponseEntity<Community> addCommunity(@Valid @RequestBody AddCommunityRequest request) {
        Community community = communityService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(community);
    }
}

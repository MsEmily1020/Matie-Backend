package com.ost.matie.domain.community.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.community.dto.CommunityResponse;
import com.ost.matie.domain.community.exception.CommunityNotFoundException;
import com.ost.matie.domain.community.repository.CommunityRepository;
import lombok.RequiredArgsConstructor;

@ReadOnlyService
@RequiredArgsConstructor
public class FindCommunityService {
    private final CommunityRepository communityRepository;

    public CommunityResponse execute(Long id) {
        return new CommunityResponse(communityRepository.findById(id)
                .orElseThrow(() -> CommunityNotFoundException.EXCEPTION));
    }
}

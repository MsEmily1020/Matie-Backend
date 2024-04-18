package com.ost.matie.service.community;

import com.ost.matie.annotation.ReadOnlyService;
import com.ost.matie.dto.community.CommunityResponse;
import com.ost.matie.exception.CommunityNotFoundException;
import com.ost.matie.repository.community.CommunityRepository;
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

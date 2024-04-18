package com.ost.matie.service.community;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.dto.community.CommunityResponse;
import com.ost.matie.exception.CommunityNotFoundException;
import com.ost.matie.repository.community.CommunityRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class FindCommunityService {
    private final CommunityRepository communityRepository;

    public CommunityResponse execute(Long id) {
        return new CommunityResponse(communityRepository.findById(id)
                .orElseThrow(() -> CommunityNotFoundException.EXCEPTION));
    }
}

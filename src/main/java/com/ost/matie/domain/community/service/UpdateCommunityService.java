package com.ost.matie.domain.community.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.community.dto.UpdateCommunityRequest;
import com.ost.matie.domain.community.exception.CommunityNotFoundException;
import com.ost.matie.domain.community.repository.CommunityRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class UpdateCommunityService {
    private final CommunityRepository communityRepository;

    public void execute(Long id, UpdateCommunityRequest request) {
        Community community = communityRepository.findById(id)
                .orElseThrow(() -> CommunityNotFoundException.EXCEPTION);

        community.update(request.getTitle(), request.getDescription(), request.getAgree(), request.getDisagree());
    }
}

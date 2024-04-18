package com.ost.matie.service.community;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.domain.community.Community;
import com.ost.matie.dto.community.UpdateCommunityRequest;
import com.ost.matie.exception.CommunityNotFoundException;
import com.ost.matie.repository.community.CommunityRepository;
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

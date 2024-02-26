package com.ost.matie.service.community;

import com.ost.matie.dto.community.CommunityResponse;
import com.ost.matie.exception.CommunityNotFoundException;
import com.ost.matie.repository.community.CommunityRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FindCommunityService {
    private final CommunityRepository communityRepository;

    @Transactional
    public CommunityResponse execute(Long id) {
        return new CommunityResponse(communityRepository.findById(id)
                .orElseThrow(() -> CommunityNotFoundException.EXCEPTION));
    }
}

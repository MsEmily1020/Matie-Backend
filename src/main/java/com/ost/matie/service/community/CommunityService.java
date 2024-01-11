package com.ost.matie.service.community;

import com.ost.matie.domain.community.Community;
import com.ost.matie.dto.community.AddCommunityRequest;
import com.ost.matie.repository.CommunityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CommunityService {
    private final CommunityRepository communityRepository;

    public Community save(AddCommunityRequest request) {
        return communityRepository.save(request.toEntity());
    }

    public List<Community> findByTypeOrderByCreatedDateDesc(String type) {
        return communityRepository.findByTypeOrderByCreatedDateDesc(type);
    }
}

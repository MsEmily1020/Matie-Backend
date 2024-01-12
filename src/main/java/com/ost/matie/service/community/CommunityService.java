package com.ost.matie.service.community;

import com.ost.matie.domain.community.Community;
import com.ost.matie.dto.community.AddCommunityRequest;
import com.ost.matie.dto.community.UpdateCommunityRequest;
import com.ost.matie.repository.CommunityRepository;
import jakarta.transaction.Transactional;
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

    public Community findById(Long id) {
        return communityRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found " + id));
    }

    public void delete(Long id) { communityRepository.deleteById(id); }

    @Transactional
    public Community update(Long id, UpdateCommunityRequest request) {
        Community community = communityRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found " + id));

        community.update(
                request.getTitle(),
                request.getTitle(),
                request.getAgree(),
                request.getDisagree()
        );

        return community;
    }
}

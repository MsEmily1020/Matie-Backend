package com.ost.matie.service.community;

import com.ost.matie.dto.community.CommunityResponse;
import com.ost.matie.exception.CommunityTypeNotFoundException;
import com.ost.matie.repository.community.CommunityRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindByTypeOrderByDateDescService {
    private final CommunityRepository communityRepository;

    @Transactional
    public List<CommunityResponse> execute (String typeName) {
        if(!(typeName.equals("Q&A") || typeName.equals("Debate"))) throw CommunityTypeNotFoundException.EXCEPTION;

        List<CommunityResponse> communities = communityRepository.findByTypeOrderByCreatedDateDesc(typeName)
                .stream()
                .map(CommunityResponse::new)
                .toList();

        return communities;
    }
}

package com.ost.matie.service.community;

import com.ost.matie.annotation.ReadOnlyService;
import com.ost.matie.dto.community.CommunityResponse;
import com.ost.matie.exception.CommunityTypeNotFoundException;
import com.ost.matie.repository.community.CommunityRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ReadOnlyService
@RequiredArgsConstructor
public class FindByTypeOrderByDateDescService {
    private final CommunityRepository communityRepository;

    public List<CommunityResponse> execute (String typeName) {
        if(!(typeName.equals("Q&A") || typeName.equals("Debate"))) throw CommunityTypeNotFoundException.EXCEPTION;

        List<CommunityResponse> communities = communityRepository.findByTypeOrderByCreatedDateDesc(typeName)
                .stream()
                .map(CommunityResponse::new)
                .toList();

        return communities;
    }
}

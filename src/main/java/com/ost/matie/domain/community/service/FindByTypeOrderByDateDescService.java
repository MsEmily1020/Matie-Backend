package com.ost.matie.domain.community.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.community.dto.CommunityResponse;
import com.ost.matie.domain.community.exception.CommunityTypeNotFoundException;
import com.ost.matie.domain.community.repository.CommunityRepository;
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

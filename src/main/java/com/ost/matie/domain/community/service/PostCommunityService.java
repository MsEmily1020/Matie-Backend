package com.ost.matie.domain.community.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.community.dto.AddCommunityRequest;
import com.ost.matie.domain.community.exception.CommunityTypeNotFoundException;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.community.repository.CommunityRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class PostCommunityService {
    private final CommunityRepository communityRepository;
    private final UserRepository userRepository;

    public void execute(AddCommunityRequest request) {
        if(!(request.getType().equals("Q&A") || request.getType().equals("Debate"))) throw CommunityTypeNotFoundException.EXCEPTION;
        if(!userRepository.existsById(request.getCreatorUser().getId())) throw UserNotFoundException.EXCEPTION;
        communityRepository.save(request.toEntity());
    }
}

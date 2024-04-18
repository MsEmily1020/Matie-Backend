package com.ost.matie.service.community;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.dto.community.AddCommunityRequest;
import com.ost.matie.exception.CommunityTypeNotFoundException;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.community.CommunityRepository;
import com.ost.matie.repository.user.UserRepository;
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

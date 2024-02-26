package com.ost.matie.service.community;

import com.ost.matie.dto.community.AddCommunityRequest;
import com.ost.matie.exception.CommunityTypeNotFoundException;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.community.CommunityRepository;
import com.ost.matie.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AddCommunityService {
    private final CommunityRepository communityRepository;
    private final UserRepository userRepository;

    @Transactional
    public void execute(AddCommunityRequest request) {
        if(!(request.getType().equals("Q&A") || request.getType().equals("Debate"))) throw CommunityTypeNotFoundException.EXCEPTION;
        if(!userRepository.existsById(request.getCreatorUser().getId())) throw UserNotFoundException.EXCEPTION;
        communityRepository.save(request.toEntity());
    }
}

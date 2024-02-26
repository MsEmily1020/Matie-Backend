package com.ost.matie.service.community;

import com.ost.matie.exception.CommunityNotFoundException;
import com.ost.matie.repository.community.CommunityRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeleteCommunityService {
    private final CommunityRepository communityRepository;

    @Transactional
    public void execute(Long id) {
        if(!communityRepository.existsById(id)) throw CommunityNotFoundException.EXCEPTION;
        communityRepository.deleteById(id);
    }
}

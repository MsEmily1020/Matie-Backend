package com.ost.matie.service.community;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.exception.CommunityNotFoundException;
import com.ost.matie.repository.community.CommunityRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class DeleteCommunityService {
    private final CommunityRepository communityRepository;

    public void execute(Long id) {
        if(!communityRepository.existsById(id)) throw CommunityNotFoundException.EXCEPTION;
        communityRepository.deleteById(id);
    }
}

package com.ost.matie.domain.community.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.community.exception.CommunityNotFoundException;
import com.ost.matie.domain.community.repository.CommunityRepository;
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

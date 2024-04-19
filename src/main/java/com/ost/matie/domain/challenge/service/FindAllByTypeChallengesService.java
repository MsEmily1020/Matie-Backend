package com.ost.matie.domain.challenge.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.domain.challenge.repository.ChallengeRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ReadOnlyService
@RequiredArgsConstructor
public class FindAllByTypeChallengesService {
    private final ChallengeRepository challengeRepository;

    public List<Challenge> execute(Integer type) {
        return challengeRepository.findAllByType(type);
    }
}

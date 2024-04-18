package com.ost.matie.service.challenge;

import com.ost.matie.annotation.ReadOnlyService;
import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.repository.challenge.ChallengeRepository;
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

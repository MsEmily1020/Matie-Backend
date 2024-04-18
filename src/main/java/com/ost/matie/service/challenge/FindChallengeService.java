package com.ost.matie.service.challenge;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.exception.ChallengeNotFoundException;
import com.ost.matie.repository.challenge.ChallengeRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class FindChallengeService {
    private final ChallengeRepository challengeRepository;

    public Challenge execute(Long id) {
        return challengeRepository.findById(id).orElseThrow(() -> ChallengeNotFoundException.EXCEPTION);
    }
}

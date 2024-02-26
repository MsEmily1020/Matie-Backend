package com.ost.matie.service.challenge;

import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.repository.challenge.ChallengeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindAllChallengesService {
    private final ChallengeRepository challengeRepository;

    @Transactional
    public List<Challenge> execute() {
        return challengeRepository.findAll();
    }
}

package com.ost.matie.service.challenge;

import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.repository.ChallengeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ChallengeService {
    private final ChallengeRepository challengeRepository;

    public List<Challenge> findAll() { return challengeRepository.findAll(); }

    public Challenge findById(Long id) {
        return challengeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found " + id));
    }
}

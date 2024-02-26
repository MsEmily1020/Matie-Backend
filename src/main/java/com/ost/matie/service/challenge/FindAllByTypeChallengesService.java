package com.ost.matie.service.challenge;

import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.repository.challenge.ChallengeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindAllByTypeChallengesService {
    private final ChallengeRepository challengeRepository;

    @Transactional
    public List<Challenge> execute(Integer type) {
        return challengeRepository.findAllByType(type);
    }
}

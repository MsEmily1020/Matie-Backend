package com.ost.matie.domain.challenge.service.challenge;

import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.domain.challenge.repository.ChallengeRepository;
import com.ost.matie.global.annotation.ReadOnlyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@ReadOnlyService
@RequiredArgsConstructor
public class FindAllPaginationChallengeService {
    private final ChallengeRepository challengeRepository;

    public Page<Challenge> execute(Integer type, Pageable pageable) {
        return challengeRepository.findAllByTypePagination(type, pageable);
    }
}

package com.ost.matie.domain.challenge.repository;

import com.ost.matie.domain.challenge.Challenge;

import java.util.List;

public interface ChallengeRepositoryCustom {
    List<Challenge> findAllByType(Integer type);
}

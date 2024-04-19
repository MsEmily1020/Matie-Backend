package com.ost.matie.domain.challenge.repository;

import com.ost.matie.domain.challenge.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChallengeRepository extends JpaRepository<Challenge, Long>, ChallengeRepositoryCustom {
}

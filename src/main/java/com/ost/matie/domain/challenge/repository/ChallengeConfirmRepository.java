package com.ost.matie.domain.challenge.repository;

import com.ost.matie.domain.challenge.ChallengeConfirm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChallengeConfirmRepository extends JpaRepository<ChallengeConfirm, Long> {
    ChallengeConfirm findByChallengeIdAndUserId(Long challenge_id, Long user_id);
}

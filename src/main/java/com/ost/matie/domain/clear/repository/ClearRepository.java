package com.ost.matie.domain.clear.repository;

import com.ost.matie.domain.clear.Clear;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface ClearRepository extends JpaRepository<Clear, Long>, ClearRepositoryCustom {
    boolean existsByUserIdAndChallengeIdAndDate(Long userId, Long challengeId, LocalDate now);
}

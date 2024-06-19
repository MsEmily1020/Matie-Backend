package com.ost.matie.domain.challenge.repository;

import com.ost.matie.domain.challenge.Challenge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ChallengeRepositoryCustom {
    List<Challenge> findAllByType(Integer type);
    Page<Challenge> findAllByTypePagination(Integer type, Pageable pageable);
}

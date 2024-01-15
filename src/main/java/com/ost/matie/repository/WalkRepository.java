package com.ost.matie.repository;

import com.ost.matie.domain.walk.Walk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface WalkRepository extends JpaRepository<Walk, Long> {
    List<Walk> findAllByUserId(Long userId);
    Walk findFirstByUserIdAndDateOrderByDateDesc(Long userId, LocalDate date);
    boolean existsByUserIdAndDate(Long userId, LocalDate date);
    boolean existsByUserId(Long userId);
}

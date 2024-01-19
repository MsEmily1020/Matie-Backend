package com.ost.matie.repository;

import com.ost.matie.domain.clear.Clear;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ClearRepository extends JpaRepository<Clear, Long> {
    List<Clear> findByUserId(Long userId);

    Clear findByUserIdAndDate(Long userId, LocalDate date);

    boolean existsByUserIdAndDate(Long userId, LocalDate date);
}

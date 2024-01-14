package com.ost.matie.repository;

import com.ost.matie.domain.clear.Clear;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ClearRepository extends JpaRepository<Clear, Long> {
    List<Clear> findAllByUserId(Long userId);

    Clear findFirstByUserIdAndDate(Long userId, LocalDate date);
}

package com.ost.matie.repository;

import com.ost.matie.domain.team.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findAllByStartDateLessThanEqualAndFinishDateGreaterThanEqualOrderByStartDateAsc(LocalDateTime startDate, LocalDateTime finishDate);
}
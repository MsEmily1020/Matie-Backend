package com.ost.matie.service.team;

import com.ost.matie.domain.team.Team;
import com.ost.matie.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public List<Team> findAll() { return teamRepository.findAll(); }
}

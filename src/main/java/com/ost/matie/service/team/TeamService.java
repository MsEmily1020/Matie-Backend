package com.ost.matie.service.team;

import com.ost.matie.domain.team.Team;
import com.ost.matie.dto.team.UpdateTeamRequest;
import com.ost.matie.repository.TeamRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public List<Team> findAll() { return teamRepository.findAll(); }

    public List<Team> findUserListInUserId(Long userId) {
        List<Team> team = teamRepository.findAll()
                .stream()
                .filter(teams -> teams.getUserList().contains(userId))
                .collect(Collectors.toList());

        return team;
    }

    @Transactional
    public Team update(Long id, UpdateTeamRequest request) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found " + id));

        team.update(request.getUserList());

        return team;
    }
}

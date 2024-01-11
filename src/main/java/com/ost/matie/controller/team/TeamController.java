package com.ost.matie.controller.team;

import com.ost.matie.domain.team.Team;
import com.ost.matie.dto.team.TeamResponse;
import com.ost.matie.dto.team.UpdateTeamRequest;
import com.ost.matie.service.team.TeamService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TeamController {
    private final TeamService teamService;

    @GetMapping("/team")
    public ResponseEntity<List<TeamResponse>> findAllTeams() {
        List<TeamResponse> teamResponses = teamService.findAll()
                .stream()
                .map(TeamResponse::new)
                .toList();

        return ResponseEntity.ok().body(teamResponses);
    }

    @PutMapping("/team/{id}")
    public ResponseEntity<Team> updateTeam(@PathVariable Long id,
                                           @Valid @RequestBody UpdateTeamRequest request) {
        Team team = teamService.update(id, request);
        return ResponseEntity.ok().body(team);
    }
}

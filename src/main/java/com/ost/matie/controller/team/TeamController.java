package com.ost.matie.controller.team;

import com.ost.matie.dto.team.TeamResponse;
import com.ost.matie.dto.user.UserResponse;
import com.ost.matie.service.team.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

package com.ost.matie.controller.challenge;

import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.domain.community.Community;
import com.ost.matie.dto.challenge.ChallengeResponse;
import com.ost.matie.dto.comment.CommentResponse;
import com.ost.matie.dto.community.CommunityResponse;
import com.ost.matie.service.challenge.ChallengeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ChallengeController {
    private final ChallengeService challengeService;

    @GetMapping("/challenge")
    public ResponseEntity<List<ChallengeResponse>> findAllChallenge() {
        List<ChallengeResponse> challengeResponses = challengeService.findAll()
                .stream()
                .map(ChallengeResponse::new)
                .toList();

        return ResponseEntity.ok().body(challengeResponses);
    }

    @GetMapping("/challenge/type/{type}")
    public ResponseEntity<List<ChallengeResponse>> findAllByTypeChallenge(@PathVariable Integer type) {
        List<ChallengeResponse> challengeResponses = challengeService.findAllByChallenge(type)
                .stream()
                .map(ChallengeResponse::new)
                .toList();

        return ResponseEntity.ok().body(challengeResponses);
    }

    @GetMapping("/challenge/{id}")
    public ResponseEntity<ChallengeResponse> findChallenge(@PathVariable Long id) {
        Challenge challenge = challengeService.findById(id);

        return ResponseEntity.ok()
                .body(new ChallengeResponse(challenge));
    }
}

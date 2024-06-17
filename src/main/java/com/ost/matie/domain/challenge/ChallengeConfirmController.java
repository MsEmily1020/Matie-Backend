package com.ost.matie.domain.challenge;

import com.ost.matie.domain.challenge.dto.ChallengeConfirmResponse;
import com.ost.matie.domain.challenge.dto.UpdateChallengeConfirmRequest;
import com.ost.matie.domain.challenge.service.challenge_confirm.GetChallengeConfirmService;
import com.ost.matie.domain.challenge.service.challenge_confirm.PutChallengeConfirmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/challenge-confirm")
public class ChallengeConfirmController {
    private final GetChallengeConfirmService getChallengeConfirmService;
    private final PutChallengeConfirmService putChallengeConfirmService;

    @GetMapping("/user/{userId}/challenge/{challengeId}")
    public ChallengeConfirmResponse findAll(@PathVariable("userId") Long userId, @PathVariable("challengeId") Long challengeId) {
        return getChallengeConfirmService.execute(userId, challengeId);
    }

    @PutMapping("/user/{userId}/challenge/{challengeId}")
    public ChallengeConfirmResponse update(
            @PathVariable("userId") Long userId,
            @PathVariable("challengeId") Long challengeId,
            @RequestBody UpdateChallengeConfirmRequest request
    ) {
        return putChallengeConfirmService.execute(userId, challengeId, request);
    }
}

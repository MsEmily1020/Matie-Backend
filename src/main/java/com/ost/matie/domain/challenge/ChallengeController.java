package com.ost.matie.domain.challenge;

import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.domain.challenge.service.FindAllByTypeChallengesService;
import com.ost.matie.domain.challenge.service.FindAllChallengesService;
import com.ost.matie.domain.challenge.service.FindChallengeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/challenge")
public class ChallengeController {
    private final FindAllChallengesService findAllChallengesService;
    private final FindAllByTypeChallengesService findAllByTypeChallengesService;
    private final FindChallengeService findChallengeService;

    @GetMapping
    public List<Challenge> findAllChallenges() {
        return findAllChallengesService.execute();
    }

    @GetMapping("/type/{type}")
    public List<Challenge> findAllByTypeChallenges(@PathVariable Integer type) {
        return findAllByTypeChallengesService.execute(type);
    }

    @GetMapping("/{id}")
    public Challenge findChallenge(@PathVariable Long id) {
        return findChallengeService.execute(id);
    }
}

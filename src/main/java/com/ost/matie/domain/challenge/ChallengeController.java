package com.ost.matie.domain.challenge;

import com.ost.matie.domain.challenge.service.challenge.FindAllByTypeChallengesService;
import com.ost.matie.domain.challenge.service.challenge.FindAllChallengesService;
import com.ost.matie.domain.challenge.service.challenge.FindAllPaginationChallengeService;
import com.ost.matie.domain.challenge.service.challenge.FindChallengeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    private final FindAllPaginationChallengeService findAllPaginationChallengeService;
    private final FindAllByTypeChallengesService findAllByTypeChallengesService;
    private final FindChallengeService findChallengeService;

    @GetMapping
    public List<Challenge> findAllChallenges() {
        return findAllChallengesService.execute();
    }

    @GetMapping("/type/{type}")
    public List<Challenge> findAllByTypeChallenges(@PathVariable("type") Integer type) {
        return findAllByTypeChallengesService.execute(type);
    }

    @GetMapping("/page/type/{type}")
    public Page<Challenge> findAllPaginationChallenges(@PathVariable("type") Integer type, Pageable pageable) {
        return findAllPaginationChallengeService.execute(type, pageable);
    }

    @GetMapping("/{id}")
    public Challenge findChallenge(@PathVariable("id") Long id) {
        return findChallengeService.execute(id);
    }
}

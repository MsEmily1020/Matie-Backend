package com.ost.matie.domain.challenge.dto;

import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.domain.challenge.ChallengeConfirm;
import com.ost.matie.domain.user.User;
import lombok.Getter;

@Getter
public class ChallengeConfirmResponse {
    private final Long id;
    private final User user;
    private final Challenge challenge;
    private final Integer count;

    public ChallengeConfirmResponse(ChallengeConfirm challengeConfirm) {
        this.id = challengeConfirm.getId();
        this.user = challengeConfirm.getUser();
        this.challenge = challengeConfirm.getChallenge();
        this.count = challengeConfirm.getCount();
    }
}

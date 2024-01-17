package com.ost.matie.dto.challenge;

import com.ost.matie.domain.challenge.Challenge;
import lombok.Getter;

@Getter
public class ChallengeResponse {
    private final Long id;
    private final String description;
    private final Long point;
    private final Integer type;

    public ChallengeResponse(Challenge challenge) {
        this.id = challenge.getId();
        this.description = challenge.getDescription();
        this.point = challenge.getPoint();
        this.type = challenge.getType();
    }
}

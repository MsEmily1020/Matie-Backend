package com.ost.matie.dto.clear;

import com.ost.matie.domain.clear.Clear;
import com.ost.matie.domain.user.Users;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class ClearResponse {
    private final Long id;
    private final LocalDate date;
    private final List<Long> challenge;
    private final Users user;

    public ClearResponse(Clear clear) {
        this.id = clear.getId();
        this.date = clear.getDate();
        this.challenge = clear.getChallenge();
        this.user = clear.getUser();
    }
}

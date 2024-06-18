package com.ost.matie.domain.clear;

import com.ost.matie.global.common.BaseEntity;
import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.domain.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Clear extends BaseEntity {
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Builder
    public Clear(LocalDate date, Challenge challenge, User user) {
        this.date = date;
        this.challenge = challenge;
        this.user = user;
    }
}

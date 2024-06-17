package com.ost.matie.domain.challenge;

import com.ost.matie.domain.user.User;
import com.ost.matie.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "challenge_confirm")
public class ChallengeConfirm extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;

    private Integer count;

    public void update(Integer count) {
        this.count = count;
    }
}

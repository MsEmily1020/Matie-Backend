package com.ost.matie.domain.challenge;

import com.ost.matie.domain.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "challenge_confirm")
public class ChallengeConfirm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;

    private Integer count;

    @Builder
    public ChallengeConfirm(User user, Challenge challenge, Integer count) {
        this.user = user;
        this.challenge = challenge;
        this.count = count;
    }

    public void update(Integer count) {
        this.count = count;
    }
}

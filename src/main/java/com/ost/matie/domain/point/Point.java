package com.ost.matie.domain.point;

import com.ost.matie.domain.BaseEntity;
import com.ost.matie.domain.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Point extends BaseEntity {
    @Column(name = "variation")
    private Long variation;

    @Column(name = "balance")
    private Long balance;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Builder
    public Point(Long variation, Long balance, User user) {
        this.variation = variation;
        this.balance = balance;
        this.user = user;
    }
}

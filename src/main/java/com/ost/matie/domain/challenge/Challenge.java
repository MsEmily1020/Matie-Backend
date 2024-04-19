package com.ost.matie.domain.challenge;

import com.ost.matie.global.common.BaseEntity;
import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Challenge extends BaseEntity {
    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "point")
    private Long point;

    @Column(name = "type")
    private Integer type;

    public static class ChallengeNotFoundException extends BusinessException {
        public static final BusinessException EXCEPTION = new ChallengeNotFoundException();
        private ChallengeNotFoundException() { super(ErrorCode.CHALLENGE_NOT_FOUND); }
    }
}

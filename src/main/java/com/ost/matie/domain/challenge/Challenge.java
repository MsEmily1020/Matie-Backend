package com.ost.matie.domain.challenge;

import com.ost.matie.global.common.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Challenge extends BaseEntity {
    private String title;

    private String description;

    private Long point;

    private Integer type;
}

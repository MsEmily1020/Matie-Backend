package com.ost.matie.domain.challenge.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateChallengeConfirmRequest {
    @NotNull(message = "count가 null입니다.")
    private Integer count;
}

package com.ost.matie.dto.clear;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateClearRequest {
    @NotNull(message = "클리어 한 챌린지 리스트를 넣어주세요.")
    private List<Long> challenge;
}

package com.ost.matie.domain.character.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateCharacterRequest {
    @NotEmpty(message = "캐릭터 이름을 넣어주세요.")
    private String name;
}

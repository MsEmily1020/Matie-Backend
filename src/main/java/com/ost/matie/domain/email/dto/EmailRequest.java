package com.ost.matie.domain.email.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class EmailRequest {
    @NotEmpty(message = "보낼 이메일 주소를 입력해주세요.")
    private String email;
}

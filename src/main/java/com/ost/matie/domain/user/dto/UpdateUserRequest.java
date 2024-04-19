package com.ost.matie.domain.user.dto;

import com.ost.matie.global.annotation.Password;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateUserRequest {
    @NotBlank(message = "비밀번호 칸이 비어있습니다.")
    @Password
    private String pw;
}

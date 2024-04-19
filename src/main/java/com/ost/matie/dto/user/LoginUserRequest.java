package com.ost.matie.dto.user;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LoginUserRequest {
    @NotBlank(message = "아이디 칸이 비어있습니다.")
    private String userId;

    @NotBlank(message = "비밀번호 칸이 비어있습니다.")
    private String pw;
}

package com.ost.matie.dto.user;

import com.ost.matie.annotation.Password;
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

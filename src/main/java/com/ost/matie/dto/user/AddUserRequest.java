package com.ost.matie.dto.user;

import com.ost.matie.annotation.Password;
import com.ost.matie.domain.user.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddUserRequest {
    @NotBlank(message = "이름 칸이 비어있습니다.")
    private String name;

    @NotBlank(message = "아이디 칸이 비어있습니다.")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z]).{6,12}", message = "6~12자 이내로 영문과 숫자만 가능합니다.")
    private String userId;

    @NotBlank(message = "이메일 칸이 비어있습니다.")
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String email;

    @NotBlank(message = "비밀번호 칸이 비어있습니다.")
    @Password
    private String pw;

    public User toEntity() {
        return User.builder()
                .name(name)
                .userId(userId)
                .email(email)
                .pw(pw)
                .build();
    }
}

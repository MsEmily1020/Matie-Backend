package com.ost.matie.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LoginUserRequest {
    @NotBlank
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z]).{8,20}")
    private String userId;

    @NotBlank
    private String pw;
}

package com.ost.matie.dto.user;

import com.ost.matie.domain.image.Image;
import com.ost.matie.domain.user.Users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}")
    private String pw;

    @NotNull
    private Image character;

    public Users toEntity() {
        return Users.builder()
                .name(name)
                .email(email)
                .pw(pw)
                .character(character)
                .build();
    }
}

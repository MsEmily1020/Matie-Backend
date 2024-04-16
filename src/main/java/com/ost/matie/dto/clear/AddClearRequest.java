package com.ost.matie.dto.clear;

import com.ost.matie.domain.challenge.Challenge;
import com.ost.matie.domain.clear.Clear;
import com.ost.matie.domain.user.User;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddClearRequest {
    @NotNull(message = "challenge의 id를 적어주세요.")
    private Challenge challenge;

    @NotNull(message = "user의 id를 적어주세요.")
    private User user;

    public Clear toEntity() {
        return Clear.builder()
                .date(LocalDate.now())
                .challenge(challenge)
                .user(user)
                .build();
    }
}

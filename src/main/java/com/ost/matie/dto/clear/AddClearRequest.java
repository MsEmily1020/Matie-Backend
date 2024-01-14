package com.ost.matie.dto.clear;

import com.ost.matie.domain.clear.Clear;
import com.ost.matie.domain.user.Users;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddClearRequest {
    private List<Long> challenge;

    @NotNull
    private Users user;

    public Clear toEntity() {
        return Clear.builder()
                .date(LocalDate.now())
                .challenge(challenge)
                .user(user)
                .build();
    }
}

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
    @NotNull(message = "데일리 챌린지 list를 넣어주세요.")
    private List<Long> challenge;

    @NotNull(message = "그룹 챌린지 list를 넣어주세요.")
    private List<Long> team;

    @NotNull(message = "user의 id를 넣어주세요.")
    private Users user;

    public Clear toEntity() {
        return Clear.builder()
                .date(LocalDate.now())
                .challenge(challenge)
                .team(team)
                .user(user)
                .build();
    }
}

package com.ost.matie.dto.walk;

import com.ost.matie.domain.user.Users;
import com.ost.matie.domain.walk.Walk;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddWalkRequest {
    private Long count;

    @NotNull(message = "user의 id를 넣어주세요.")
    private Users user;

    public Walk toEntity() {
        return Walk.builder()
                .count(count)
                .date(LocalDate.now())
                .user(user)
                .build();
    }
}

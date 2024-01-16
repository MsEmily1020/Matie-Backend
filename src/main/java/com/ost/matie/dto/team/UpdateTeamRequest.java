package com.ost.matie.dto.team;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateTeamRequest {
    @NotNull(message = "user list를 넣어주세요.")
    private List<Long> userList;
}

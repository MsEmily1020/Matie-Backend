package com.ost.matie.dto.community;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserCommunityRequest {
    @NotEmpty
    private String title;

    @NotEmpty
    private String description;

    private Long agree;
    private Long disagree;
}

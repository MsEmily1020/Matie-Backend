package com.ost.matie.dto.community;

import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.point.Point;
import com.ost.matie.domain.user.Users;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddCommunityRequest {
    @NotEmpty
    private String title;

    @NotEmpty
    private String description;

    @NotEmpty
    private String type;

    private Long agree;
    private Long disagree;

    @NotNull
    private Users user;

    public Community toEntity() {
        return Community.builder()
                .title(title)
                .description(description)
                .type(type)
                .agree(agree)
                .disagree(disagree)
                .user(user)
                .build();
    }
}

package com.ost.matie.domain.community.dto;

import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.user.User;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddCommunityRequest {
    @NotEmpty(message = "제목 칸이 비어있습니다.")
    private String title;

    @NotEmpty(message = "설명 칸이 비어있습니다.")
    private String description;

    @NotEmpty(message = "타입 칸이 비어있습니다.")
    private String type;

    @NotNull(message = "user의 id를 넣어주세요.")
    private User creatorUser;

    public Community toEntity() {
        return Community.builder()
                .title(title)
                .description(description)
                .type(type)
                .agree(0L)
                .disagree(0L)
                .creatorUser(creatorUser)
                .build();
    }
}

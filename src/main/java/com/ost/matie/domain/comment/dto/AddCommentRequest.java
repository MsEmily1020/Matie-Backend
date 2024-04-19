package com.ost.matie.domain.comment.dto;

import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.user.User;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddCommentRequest {
    @NotEmpty(message = "설명 칸이 비어있습니다.")
    private String description;

    @NotNull(message = "user의 id를 넣어주세요.")
    private User user;

    @NotNull(message = "community의 id를 넣어주세요.")
    private Community community;

    public Comment toEntity() {
        return Comment.builder()
                .description(description)
                .user(user)
                .community(community)
                .build();
    }
}

package com.ost.matie.domain.upvote.dto;

import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.upvote.Upvote;
import com.ost.matie.domain.user.User;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddUpvoteRequest {
    @NotNull(message = "user의 id를 적어주세요.")
    private User user;

    @NotNull(message = "comment의 id를 적어주세요.")
    private Comment comment;

    public Upvote toEntity() {
        return Upvote.builder()
                .user(user)
                .comment(comment)
                .build();
    }
}

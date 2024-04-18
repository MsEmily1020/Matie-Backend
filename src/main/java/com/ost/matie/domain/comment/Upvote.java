package com.ost.matie.domain.comment;

import com.ost.matie.domain.BaseEntity;
import com.ost.matie.domain.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Upvote extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @Builder
    public Upvote(User user, Comment comment) {
        this.user = user;
        this.comment = comment;
    }
}

package com.ost.matie.dto.comment.upvote;

import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.comment.Upvote;
import com.ost.matie.domain.user.User;
import lombok.Getter;

@Getter
public class UpvoteResponse {
    private final Long id;
    private final User user;
    private final Comment comment;

    public UpvoteResponse(Upvote upvote) {
        this.id = upvote.getId();
        this.user = upvote.getUser();
        this.comment = upvote.getComment();
    }
}

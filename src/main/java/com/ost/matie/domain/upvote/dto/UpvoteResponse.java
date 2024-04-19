package com.ost.matie.domain.upvote.dto;

import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.upvote.Upvote;
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

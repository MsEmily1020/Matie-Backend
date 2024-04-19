package com.ost.matie.domain.comment.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.user.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentResponse {
    private final Long id;
    private final String description;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private final LocalDateTime createdDate;
    private final LocalDateTime modifiedDate;
    private final User user;
    private final Community community;

    public CommentResponse(Comment comment) {
        this.id = comment.getId();
        this.description = comment.getDescription();
        this.createdDate = comment.getCreatedDate();
        this.modifiedDate = comment.getModifiedDate();
        this.user = comment.getUser();
        this.community = comment.getCommunity();
    }
}

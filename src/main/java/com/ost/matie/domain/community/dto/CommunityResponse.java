package com.ost.matie.domain.community.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.user.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommunityResponse {
    private final Long id;
    private final String title;
    private final String description;
    private final String type;
    private final Long agree;
    private final Long disagree;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private final LocalDateTime createdDate;
    private final User creatorUser;

    public CommunityResponse(Community community) {
        this.id = community.getId();
        this.title = community.getTitle();
        this.description = community.getDescription();
        this.type = community.getType();
        this.agree = community.getAgree();
        this.disagree = community.getDisagree();
        this.createdDate = community.getCreatedDate();
        this.creatorUser = community.getCreatorUser();
    }
}

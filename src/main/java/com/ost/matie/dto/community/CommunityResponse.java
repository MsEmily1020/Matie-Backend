package com.ost.matie.dto.community;

import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.point.Point;
import com.ost.matie.domain.user.Users;
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
    private final LocalDateTime createdDate;
    private final Users user;

    public CommunityResponse(Community community) {
        this.id = community.getId();
        this.title = community.getTitle();
        this.description = community.getDescription();
        this.type = community.getType();
        this.agree = community.getAgree();
        this.disagree = community.getDisagree();
        this.createdDate = community.getCreatedDate();
        this.user = community.getUser();
    }
}

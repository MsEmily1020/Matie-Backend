package com.ost.matie.domain.community;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ost.matie.global.common.BaseEntity;
import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Community extends BaseEntity {
    private String title;

    private String description;

    private String type;

    private Long agree;

    private Long disagree;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User creatorUser;

    @JsonIgnore
    @OneToMany(mappedBy = "community", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> commentList;

    @Builder
    public Community(String title, String description, String type, Long agree, Long disagree, User creatorUser) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.agree = agree;
        this.disagree = disagree;
        this.creatorUser = creatorUser;
    }

    public void update(String title, String description, Long agree, Long disagree) {
        this.title = title;
        this.description = description;
        this.agree = agree;
        this.disagree = disagree;
    }
}

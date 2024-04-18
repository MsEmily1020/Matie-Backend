package com.ost.matie.domain.community;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ost.matie.domain.BaseEntity;
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
    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @Column(name = "agree")
    private Long agree;

    @Column(name = "disagree")
    private Long disagree;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User creatorUser;

    @JsonIgnore
    @OneToMany(mappedBy = "community", cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
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

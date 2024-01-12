package com.ost.matie.domain.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ost.matie.domain.BaseTimeEntity;
import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.image.Image;
import com.ost.matie.domain.point.Point;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "pw")
    private String pw;

    @ManyToOne
    @JoinColumn(name = "mascot_id")
    private Image mascot;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<Point> pointList;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<Comment> commentList;

    @Builder
    public Users(String name, String email, String pw, Image mascot) {
        this.name = name;
        this.email = email;
        this.pw = pw;
        this.mascot = mascot;
    }

    public void update(String name, String pw, Image mascot) {
        this.name = name;
        this.pw = pw;
        this.mascot = mascot;
    }
}

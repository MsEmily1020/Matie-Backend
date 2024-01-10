package com.ost.matie.domain.user;

import com.ost.matie.domain.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

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
    @JoinColumn(name = "character_id")
    private Image character;

    @Builder
    public Users(String name, String email, String pw, Image character) {
        this.name = name;
        this.email = email;
        this.pw = pw;
        this.character = character;
    }

    public void update(String name, String pw, Image character) {
        this.name = name;
        this.pw = pw;
        this.character = character;
    }
}

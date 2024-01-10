package com.ost.matie.domain.image;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ost.matie.domain.user.Users;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "url")
    private String url;

    @JsonIgnore
    @OneToMany(mappedBy = "character", cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<Users> usersList;
}

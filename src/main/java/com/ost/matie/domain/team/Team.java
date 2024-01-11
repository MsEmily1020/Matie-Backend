package com.ost.matie.domain.team;

import com.ost.matie.config.LongListConverter;
import com.ost.matie.domain.image.Image;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "finish_date")
    private LocalDateTime finishDate;

    @Convert(converter = LongListConverter.class)
    private List<Long> userList;

    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;

    public void update(List<Long> userList) {
        this.userList = userList;
    }
}

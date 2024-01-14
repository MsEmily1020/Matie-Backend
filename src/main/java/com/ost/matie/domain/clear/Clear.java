package com.ost.matie.domain.clear;

import com.ost.matie.config.LongListConverter;
import com.ost.matie.domain.user.Users;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Clear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Convert(converter = LongListConverter.class)
    private List<Long> challenge;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Builder
    public Clear(LocalDate date, List<Long> challenge, Users user) {
        this.date = date;
        this.challenge = challenge;
        this.user = user;
    }

    public void update(List<Long> challenge) {
        this.challenge = challenge;
    }
}

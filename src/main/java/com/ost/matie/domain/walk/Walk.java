package com.ost.matie.domain.walk;

import com.ost.matie.domain.user.Users;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Walk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "count")
    private Long count;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Builder
    public Walk(Long count, LocalDate date, Users user) {
        this.count = count;
        this.date = date;
        this.user = user;
    }

    public void update(Long count) {
        this.count = count;
    }
}

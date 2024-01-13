package com.ost.matie.domain.cart;

import com.ost.matie.config.LongListConverter;
import com.ost.matie.domain.user.Users;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long cart;

    @Convert(converter = LongListConverter.class)
    private List<Long> count;

    @Convert(converter = LongListConverter.class)
    private List<Long> products;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Builder
    public Cart(List<Long> count, List<Long> products, Users user) {
        this.count = count;
        this.products = products;
        this.user = user;
    }

    public void update(List<Long> count, List<Long> products) {
        this.count = count;
        this.products = products;
    }
}

package com.ost.matie.domain.favorite_product;

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
public class FavoriteProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Convert(converter = LongListConverter.class)
    private List<Long> product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Builder
    public FavoriteProduct(List<Long> product, Users user) {
        this.product = product;
        this.user = user;
    }

    public void update(List<Long> product) {
        this.product = product;
    }
}

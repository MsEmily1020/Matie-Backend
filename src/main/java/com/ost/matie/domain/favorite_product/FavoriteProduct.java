package com.ost.matie.domain.favorite_product;

import com.ost.matie.domain.BaseEntity;
import com.ost.matie.domain.product.Product;
import com.ost.matie.domain.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FavoriteProduct extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Builder
    public FavoriteProduct(Product product, User user) {
        this.product = product;
        this.user = user;
    }
}

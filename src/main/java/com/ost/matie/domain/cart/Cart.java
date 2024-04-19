package com.ost.matie.domain.cart;

import com.ost.matie.global.common.BaseEntity;
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
public class Cart extends BaseEntity {
    @Column(name = "count")
    private Long count;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Builder
    public Cart(Long count, Product product, User user) {
        this.count = count;
        this.product = product;
        this.user = user;
    }

    public void update(Long count) {
        this.count = count;
    }
}

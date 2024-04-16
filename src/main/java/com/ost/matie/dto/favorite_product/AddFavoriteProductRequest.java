package com.ost.matie.dto.favorite_product;

import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.domain.product.Product;
import com.ost.matie.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddFavoriteProductRequest {
    private Product product;
    private User user;

    public FavoriteProduct toEntity() {
        return FavoriteProduct.builder()
                .product(product)
                .user(user)
                .build();
    }
}

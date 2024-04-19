package com.ost.matie.domain.favorite_product.dto;

import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.domain.product.Product;
import com.ost.matie.domain.user.User;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddFavoriteProductRequest {
    @NotNull(message = "product의 id를 적어주세요.")
    private Product product;

    @NotNull(message = "user의 id를 넣어주세요.")
    private User user;

    public FavoriteProduct toEntity() {
        return FavoriteProduct.builder()
                .product(product)
                .user(user)
                .build();
    }
}

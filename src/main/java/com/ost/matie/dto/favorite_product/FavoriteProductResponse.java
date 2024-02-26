package com.ost.matie.dto.favorite_product;

import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.domain.product.Product;
import com.ost.matie.dto.user.UserResponse;
import lombok.Getter;

@Getter
public class FavoriteProductResponse {
    private final Long id;
    private final Product product;
    private final UserResponse user;

    public FavoriteProductResponse(FavoriteProduct favoriteProduct) {
        this.id = favoriteProduct.getId();
        this.product = favoriteProduct.getProduct();
        this.user = new UserResponse(favoriteProduct.getUser());
    }
}

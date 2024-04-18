package com.ost.matie.dto.favorite_product;

import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.domain.product.Product;
import com.ost.matie.domain.user.User;
import lombok.Getter;

@Getter
public class FavoriteProductResponse {
    private final Long id;
    private final Product product;
    private final User user;

    public FavoriteProductResponse(FavoriteProduct favoriteProduct) {
        this.id = favoriteProduct.getId();
        this.product = favoriteProduct.getProduct();
        this.user = favoriteProduct.getUser();
    }
}

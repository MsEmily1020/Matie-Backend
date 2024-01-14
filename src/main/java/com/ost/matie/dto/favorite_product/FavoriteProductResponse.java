package com.ost.matie.dto.favorite_product;

import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.domain.user.Users;
import lombok.Getter;

import java.util.List;

@Getter
public class FavoriteProductResponse {
    private final Long id;
    private final List<Long> product;
    private final Users user;

    public FavoriteProductResponse(FavoriteProduct favoriteProduct) {
        this.id = favoriteProduct.getId();
        this.product = favoriteProduct.getProduct();
        this.user = favoriteProduct.getUser();
    }
}

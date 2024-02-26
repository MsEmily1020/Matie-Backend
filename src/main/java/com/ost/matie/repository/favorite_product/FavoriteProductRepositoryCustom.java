package com.ost.matie.repository.favorite_product;

import com.ost.matie.domain.favorite_product.FavoriteProduct;

import java.util.List;

public interface FavoriteProductRepositoryCustom {
    List<FavoriteProduct> findByUserId(Long userId);
    FavoriteProduct findByUserIdAndProductId(Long userId, Long productId);
}

package com.ost.matie.domain.favorite_product.repository;

import com.ost.matie.domain.favorite_product.FavoriteProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteProductRepository extends JpaRepository<FavoriteProduct, Long>, FavoriteProductRepositoryCustom {
    boolean existsByUserIdAndProductId(Long userId, Long productId);
}

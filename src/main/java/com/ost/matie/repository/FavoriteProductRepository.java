package com.ost.matie.repository;

import com.ost.matie.domain.favorite_product.FavoriteProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteProductRepository extends JpaRepository<FavoriteProduct, Long> {
    FavoriteProduct findByUserId(Long userId);
    boolean existsByUserId(Long userId);
}

package com.ost.matie.domain.cart.repository;

import com.ost.matie.domain.cart.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long>, CartRepositoryCustom {
    boolean existsByProductIdAndUserId(Long productId, Long userId);
}

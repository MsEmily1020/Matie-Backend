package com.ost.matie.repository.cart;

import com.ost.matie.domain.cart.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface CartRepository extends JpaRepository<Cart, Long>, CartRepositoryCustom {
    boolean existsByProductIdAndUserId(Long productId, Long userId);
}

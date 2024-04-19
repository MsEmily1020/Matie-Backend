package com.ost.matie.domain.cart.repository;

import com.ost.matie.domain.cart.Cart;

import java.util.List;

public interface CartRepositoryCustom {
    List<Cart> findByUserId(Long userId);
}

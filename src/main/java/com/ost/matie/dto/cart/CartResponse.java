package com.ost.matie.dto.cart;

import com.ost.matie.domain.cart.Cart;
import com.ost.matie.domain.user.Users;
import com.ost.matie.dto.user.UserResponse;
import lombok.Getter;

import java.util.List;

@Getter
public class CartResponse {
    private final Long id;
    private final List<Long> count;
    private final List<Long> products;
    private final UserResponse user;

    public CartResponse(Cart cart) {
        this.id = cart.getId();
        this.count = cart.getCount();
        this.products = cart.getProducts();
        this.user = new UserResponse(cart.getUser());
    }
}

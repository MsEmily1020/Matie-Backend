package com.ost.matie.dto.cart;

import com.ost.matie.domain.cart.Cart;
import com.ost.matie.domain.product.Product;
import com.ost.matie.domain.user.User;
import lombok.Getter;

@Getter
public class CartResponse {
    private final Long id;
    private final Long count;
    private final Product product;
    private final User user;

    public CartResponse(Cart cart) {
        this.id = cart.getId();
        this.count = cart.getCount();
        this.product = cart.getProduct();
        this.user = cart.getUser();
    }
}

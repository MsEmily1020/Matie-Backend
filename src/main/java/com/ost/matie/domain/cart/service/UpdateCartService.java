package com.ost.matie.domain.cart.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.cart.Cart;
import com.ost.matie.domain.cart.dto.UpdateCartRequest;
import com.ost.matie.domain.cart.exception.CartNotFoundException;
import com.ost.matie.domain.cart.repository.CartRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class UpdateCartService {
    private final CartRepository cartRepository;

    public void execute(Long id, UpdateCartRequest request) {
        Cart cart = cartRepository.findById(id).orElseThrow(() -> CartNotFoundException.EXCEPTION);
        cart.update(request.getCount());
    }
}

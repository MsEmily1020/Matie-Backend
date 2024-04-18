package com.ost.matie.service.cart;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.dto.cart.AddCartRequest;
import com.ost.matie.repository.cart.CartRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class PostCartService {
    private final CartRepository cartRepository;

    public void execute(AddCartRequest request) {
        cartRepository.save(request.toEntity());
    }
}

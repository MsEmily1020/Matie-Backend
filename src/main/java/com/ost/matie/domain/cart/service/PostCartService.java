package com.ost.matie.domain.cart.service;

import com.ost.matie.domain.cart.dto.AddCartRequest;
import com.ost.matie.domain.cart.exception.CartDuplicateException;
import com.ost.matie.domain.cart.repository.CartRepository;
import com.ost.matie.domain.product.exception.ProductNotFoundException;
import com.ost.matie.domain.product.repository.ProductRepository;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.user.repository.UserRepository;
import com.ost.matie.global.annotation.TransactionalService;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class PostCartService {
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final CartRepository cartRepository;

    public void execute(AddCartRequest request) {
        Long userId = request.getUser().getId();
        Long productId = request.getProduct().getId();

        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;
        if(!productRepository.existsById(productId)) throw ProductNotFoundException.EXCEPTION;
        if(cartRepository.existsByProductIdAndUserId(userId, productId)) throw CartDuplicateException.EXCEPTION;

        cartRepository.save(request.toEntity());
    }
}

package com.ost.matie.service.cart;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.dto.cart.AddCartRequest;
import com.ost.matie.exception.CartDuplicateException;
import com.ost.matie.exception.ProductNotFoundException;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.cart.CartRepository;
import com.ost.matie.repository.product.ProductRepository;
import com.ost.matie.repository.user.UserRepository;
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

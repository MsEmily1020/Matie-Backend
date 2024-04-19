package com.ost.matie.domain.cart.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.cart.dto.CartResponse;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.cart.repository.CartRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ReadOnlyService
@RequiredArgsConstructor
public class FindByUserIdCartService {
    private final CartRepository cartRepository;
    private final UserRepository userRepository;

    public List<CartResponse> execute(Long userId) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;
        return cartRepository.findByUserId(userId)
                .stream()
                .map(CartResponse::new)
                .toList();
    }
}

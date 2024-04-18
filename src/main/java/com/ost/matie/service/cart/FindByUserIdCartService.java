package com.ost.matie.service.cart;

import com.ost.matie.annotation.ReadOnlyService;
import com.ost.matie.dto.cart.CartResponse;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.cart.CartRepository;
import com.ost.matie.repository.user.UserRepository;
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

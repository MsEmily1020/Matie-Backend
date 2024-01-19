package com.ost.matie.controller.cart;

import com.ost.matie.domain.cart.Cart;
import com.ost.matie.dto.cart.AddCartRequest;
import com.ost.matie.dto.cart.CartResponse;
import com.ost.matie.dto.cart.UpdateCartRequest;
import com.ost.matie.service.cart.CartService;
import com.ost.matie.service.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CartController {
    private final CartService cartService;
    private final UserService userService;

    @GetMapping("/cart/{userId}")
    public ResponseEntity<CartResponse> findByUserIdCart(@PathVariable Long userId) {
        userService.findById(userId);

        Cart cart = cartService.findByUserId(userId);

        return ResponseEntity.ok()
                .body(new CartResponse(cart));
    }

    @PutMapping("/cart/{userId}")
    public ResponseEntity<CartResponse> updateCart(@PathVariable Long userId,
                                           @RequestBody UpdateCartRequest request) {
        userService.findById(userId);
        Cart cart = cartService.update(userId, request);
        return ResponseEntity.ok().body(new CartResponse(cart));
    }
}

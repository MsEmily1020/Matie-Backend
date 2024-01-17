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

    @PostMapping("/cart")
    public ResponseEntity<CartResponse> addCart(@Valid @RequestBody AddCartRequest request) {
        userService.findById(request.getUser().getId());
        Cart cart = cartService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new CartResponse(cart));
    }

    @GetMapping("/cart/{userId}")
    public ResponseEntity<CartResponse> findByUserId(@PathVariable Long userId) {
        userService.findById(userId);

        Cart cart = cartService.findByUserId(userId);

        return ResponseEntity.ok()
                .body(new CartResponse(cart));
    }

    @PutMapping("/cart/{id}")
    public ResponseEntity<CartResponse> updateCart(@PathVariable Long id,
                                           @RequestBody UpdateCartRequest request) {
        Cart cart = cartService.update(id, request);
        return ResponseEntity.ok().body(new CartResponse(cart));
    }
}

package com.ost.matie.controller.cart;

import com.ost.matie.domain.cart.Cart;
import com.ost.matie.dto.cart.AddCartRequest;
import com.ost.matie.dto.cart.CartResponse;
import com.ost.matie.dto.cart.UpdateCartRequest;
import com.ost.matie.service.cart.CartService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CartController {
    private final CartService cartService;

    @PostMapping("/cart")
    public ResponseEntity<Cart> addCart(@Valid @RequestBody AddCartRequest request) {
        Cart cart = cartService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(cart);
    }

    @GetMapping("/cart/{userId}")
    public ResponseEntity<CartResponse> findByUserId(@PathVariable Long userId) {
        Cart cart = cartService.findByUserId(userId);

        return ResponseEntity.ok()
                .body(new CartResponse(cart));
    }

    @PutMapping("/cart/{id}")
    public ResponseEntity<Cart> updateCart(@PathVariable Long id,
                                           @RequestBody UpdateCartRequest request) {
        Cart cart = cartService.update(id, request);
        return ResponseEntity.ok().body(cart);
    }
}

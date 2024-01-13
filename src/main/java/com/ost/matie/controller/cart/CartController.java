package com.ost.matie.controller.cart;

import com.ost.matie.domain.cart.Cart;
import com.ost.matie.domain.comment.Comment;
import com.ost.matie.dto.cart.AddCartRequest;
import com.ost.matie.dto.comment.AddCommentRequest;
import com.ost.matie.service.cart.CartService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}

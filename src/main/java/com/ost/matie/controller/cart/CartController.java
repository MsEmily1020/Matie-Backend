package com.ost.matie.controller.cart;

import com.ost.matie.dto.cart.AddCartRequest;
import com.ost.matie.dto.cart.CartResponse;
import com.ost.matie.dto.cart.UpdateCartRequest;
import com.ost.matie.service.cart.PostCartService;
import com.ost.matie.service.cart.FindByUserIdCartService;
import com.ost.matie.service.cart.UpdateCartService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cart")
public class CartController {
    private final PostCartService postCartService;
    private final FindByUserIdCartService findByUserIdCartService;
    private final UpdateCartService updateCartService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCart(@Valid @RequestBody AddCartRequest request) {
        postCartService.execute(request);
    }

    @GetMapping("/{userId}")
    public List<CartResponse> findByUserIdCart(@PathVariable Long userId) {
        return findByUserIdCartService.execute(userId);
    }

    @PutMapping("/{id}")
    public void updateCart(
            @PathVariable Long id,
            @Valid @RequestBody UpdateCartRequest request
    ) {
        updateCartService.execute(id, request);
    }
}

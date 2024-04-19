package com.ost.matie.domain.cart;

import com.ost.matie.domain.cart.dto.AddCartRequest;
import com.ost.matie.domain.cart.dto.CartResponse;
import com.ost.matie.domain.cart.dto.UpdateCartRequest;
import com.ost.matie.domain.cart.service.PostCartService;
import com.ost.matie.domain.cart.service.FindByUserIdCartService;
import com.ost.matie.domain.cart.service.UpdateCartService;
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

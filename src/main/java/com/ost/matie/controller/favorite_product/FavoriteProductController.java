package com.ost.matie.controller.favorite_product;

import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.dto.favorite_product.AddFavoriteProductRequest;
import com.ost.matie.dto.favorite_product.FavoriteProductResponse;
import com.ost.matie.dto.favorite_product.UpdateFavoriteProductRequest;
import com.ost.matie.service.favorite_product.FavoriteProductService;
import com.ost.matie.service.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class FavoriteProductController {
    private final FavoriteProductService favoriteProductService;
    private final UserService userService;

    @PostMapping("/favorite-product")
    public ResponseEntity<FavoriteProduct> addFavoriteProduct(@Valid @RequestBody AddFavoriteProductRequest request) {
        userService.findById(request.getUser().getId());
        FavoriteProduct favoriteProduct = favoriteProductService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(favoriteProduct);
    }

    @GetMapping("/favorite-product/{userId}")
    public ResponseEntity<FavoriteProductResponse> findByUserIdProductResponse(@PathVariable Long userId) {
        userService.findById(userId);
        FavoriteProduct favoriteProduct = favoriteProductService.findByUserId(userId);

        return ResponseEntity.ok()
                .body(new FavoriteProductResponse(favoriteProduct));
    }

    @PutMapping("/favorite-product/{userId}")
    public ResponseEntity<FavoriteProduct> updateFavoriteProduct(@PathVariable Long userId,
                                                                 @Valid @RequestBody UpdateFavoriteProductRequest request) {
        userService.findById(userId);
        FavoriteProduct favoriteProduct = favoriteProductService.update(userId, request);
        return ResponseEntity.ok().body(favoriteProduct);
    }
}

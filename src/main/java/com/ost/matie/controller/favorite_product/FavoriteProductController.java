package com.ost.matie.controller.favorite_product;

import com.ost.matie.dto.favorite_product.AddFavoriteProductRequest;
import com.ost.matie.dto.favorite_product.FavoriteProductResponse;
import com.ost.matie.service.favorite_product.PostFavoriteProductService;
import com.ost.matie.service.favorite_product.DeleteFavoriteProductService;
import com.ost.matie.service.favorite_product.FindByUserIdFavoriteProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/favorite-product")
public class FavoriteProductController {
    private final PostFavoriteProductService postFavoriteProductService;
    private final FindByUserIdFavoriteProductService findByUserIdService;
    private final DeleteFavoriteProductService deleteFavoriteProductService;

    @PostMapping
    public void addFavoriteProduct(@Valid @RequestBody AddFavoriteProductRequest request) {
        postFavoriteProductService.execute(request);
    }

    @GetMapping("/{userId}")
    public List<FavoriteProductResponse> findByUserIdProductResponse(@PathVariable Long userId) {
        return findByUserIdService.execute(userId);
    }

    @DeleteMapping("/{userId}/{productId}")
    public void deleteFavoriteProduct(@PathVariable Long userId, @PathVariable Long productId) {
        deleteFavoriteProductService.execute(userId, productId);
    }
}

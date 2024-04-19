package com.ost.matie.domain.favorite_product;

import com.ost.matie.domain.favorite_product.dto.AddFavoriteProductRequest;
import com.ost.matie.domain.favorite_product.dto.FavoriteProductResponse;
import com.ost.matie.domain.favorite_product.service.PostFavoriteProductService;
import com.ost.matie.domain.favorite_product.service.DeleteFavoriteProductService;
import com.ost.matie.domain.favorite_product.service.FindByUserIdFavoriteProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
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

package com.ost.matie.controller.favorite_product;

import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.dto.community.AddCommunityRequest;
import com.ost.matie.dto.favorite_product.AddFavoriteProductRequest;
import com.ost.matie.service.favorite_product.FavoriteProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class FavoriteProductController {
    private final FavoriteProductService favoriteProductService;

    @PostMapping("/favorite-product")
    public ResponseEntity<FavoriteProduct> addFavoriteProduct(@Valid @RequestBody AddFavoriteProductRequest request) {
        FavoriteProduct favoriteProduct = favoriteProductService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(favoriteProduct);
    }
}

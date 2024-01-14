package com.ost.matie.service.favorite_product;

import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.dto.favorite_product.AddFavoriteProductRequest;
import com.ost.matie.dto.favorite_product.UpdateFavoriteProductRequest;
import com.ost.matie.repository.FavoriteProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FavoriteProductService {
    private final FavoriteProductRepository favoriteProductRepository;

    public FavoriteProduct save(AddFavoriteProductRequest request) {
        return favoriteProductRepository.save(request.toEntity());
    }

    public FavoriteProduct findByUserId(Long userId) {
        return favoriteProductRepository.findByUserId(userId);
    }

    @Transactional
    public FavoriteProduct update(Long userId, UpdateFavoriteProductRequest request) {
        FavoriteProduct favoriteProduct = favoriteProductRepository.findByUserId(userId);
        favoriteProduct.update(request.getProduct());
        return favoriteProduct;
    }
}

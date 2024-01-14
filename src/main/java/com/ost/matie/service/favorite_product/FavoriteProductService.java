package com.ost.matie.service.favorite_product;

import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.dto.favorite_product.AddFavoriteProductRequest;
import com.ost.matie.dto.favorite_product.FavoriteProductResponse;
import com.ost.matie.repository.FavoriteProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
}

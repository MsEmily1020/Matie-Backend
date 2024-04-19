package com.ost.matie.domain.favorite_product.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.favorite_product.dto.FavoriteProductResponse;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.favorite_product.repository.FavoriteProductRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ReadOnlyService
@RequiredArgsConstructor
public class FindByUserIdFavoriteProductService {
    private final FavoriteProductRepository favoriteProductRepository;
    private final UserRepository userRepository;

    public List<FavoriteProductResponse> execute(Long userId) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;

        List<FavoriteProductResponse> favoriteProducts = favoriteProductRepository.findByUserId(userId)
                .stream()
                .map(FavoriteProductResponse::new)
                .toList();

        return favoriteProducts;
    }
}

package com.ost.matie.domain.favorite_product.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.domain.favorite_product.exception.FavoriteProductNotFoundException;
import com.ost.matie.domain.product.exception.ProductNotFoundException;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.favorite_product.repository.FavoriteProductRepository;
import com.ost.matie.domain.product.repository.ProductRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class DeleteFavoriteProductService {
    private final FavoriteProductRepository favoriteProductRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public void execute(Long userId, Long productId) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;
        if(!productRepository.existsById(productId)) throw ProductNotFoundException.EXCEPTION;

        FavoriteProduct favoriteProduct = favoriteProductRepository.findByUserIdAndProductId(userId, productId);
        if(favoriteProduct == null) throw FavoriteProductNotFoundException.EXCEPTION;
        favoriteProductRepository.delete(favoriteProduct);
    }
}

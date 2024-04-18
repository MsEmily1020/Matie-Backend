package com.ost.matie.service.favorite_product;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.exception.FavoriteProductNotFoundException;
import com.ost.matie.exception.ProductNotFoundException;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.favorite_product.FavoriteProductRepository;
import com.ost.matie.repository.product.ProductRepository;
import com.ost.matie.repository.user.UserRepository;
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

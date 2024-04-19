package com.ost.matie.domain.favorite_product.service;

import com.ost.matie.global.annotation.TransactionalService;
import com.ost.matie.domain.favorite_product.dto.AddFavoriteProductRequest;
import com.ost.matie.domain.favorite_product.exception.FavoriteProductDuplicateException;
import com.ost.matie.domain.product.exception.ProductNotFoundException;
import com.ost.matie.domain.user.exception.UserNotFoundException;
import com.ost.matie.domain.favorite_product.repository.FavoriteProductRepository;
import com.ost.matie.domain.product.repository.ProductRepository;
import com.ost.matie.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class PostFavoriteProductService {
    private final FavoriteProductRepository favoriteProductRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    public void execute(AddFavoriteProductRequest request) {
        if(!productRepository.existsById(request.getProduct().getId())) throw ProductNotFoundException.EXCEPTION;
        if(!userRepository.existsById(request.getUser().getId())) throw UserNotFoundException.EXCEPTION;

        if(favoriteProductRepository.existsByUserIdAndProductId(
                request.getUser().getId(),
                request.getProduct().getId()
        )) throw FavoriteProductDuplicateException.EXCEPTION;

        favoriteProductRepository.save(request.toEntity());
    }
}

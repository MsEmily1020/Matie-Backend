package com.ost.matie.service.favorite_product;

import com.ost.matie.dto.favorite_product.AddFavoriteProductRequest;
import com.ost.matie.exception.FavoriteProductDuplicateException;
import com.ost.matie.exception.ProductNotFoundException;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.favorite_product.FavoriteProductRepository;
import com.ost.matie.repository.product.ProductRepository;
import com.ost.matie.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostFavoriteProductService {
    private final FavoriteProductRepository favoriteProductRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    @Transactional
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

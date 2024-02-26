package com.ost.matie.service.favorite_product;

import com.ost.matie.dto.favorite_product.FavoriteProductResponse;
import com.ost.matie.exception.UserNotFoundException;
import com.ost.matie.repository.favorite_product.FavoriteProductRepository;
import com.ost.matie.repository.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindByUserIdFavoriteProductService {
    private final FavoriteProductRepository favoriteProductRepository;
    private final UserRepository userRepository;

    @Transactional
    public List<FavoriteProductResponse> execute(Long userId) {
        if(!userRepository.existsById(userId)) throw UserNotFoundException.EXCEPTION;

        List<FavoriteProductResponse> favoriteProducts = favoriteProductRepository.findByUserId(userId)
                .stream()
                .map(FavoriteProductResponse::new)
                .toList();

        return favoriteProducts;
    }
}

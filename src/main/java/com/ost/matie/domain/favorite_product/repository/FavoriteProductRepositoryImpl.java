package com.ost.matie.domain.favorite_product.repository;

import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ost.matie.domain.favorite_product.QFavoriteProduct.favoriteProduct;


@Repository
@RequiredArgsConstructor
public class FavoriteProductRepositoryImpl implements FavoriteProductRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public List<FavoriteProduct> findByUserId(Long userId) {
        return queryFactory
                .selectFrom(favoriteProduct)
                .where(favoriteProduct.user.id.eq(userId))
                .fetch();
    }

    @Override
    public FavoriteProduct findByUserIdAndProductId(Long userId, Long productId) {
        return queryFactory
                .selectFrom(favoriteProduct)
                .where(favoriteProduct.user.id.eq(userId)
                        .and(favoriteProduct.product.id.eq(productId)))
                .fetchOne();
    }
}

package com.ost.matie.dto.favorite_product;

import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.favorite_product.FavoriteProduct;
import com.ost.matie.domain.user.Users;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddFavoriteProductRequest {
    private List<Long> product;
    private Users user;

    public FavoriteProduct toEntity() {
        return FavoriteProduct.builder()
                .product(product)
                .user(user)
                .build();
    }
}

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
    @NotNull(message = "상품 리스트를 넣어주세요.")
    private List<Long> product;

    @NotNull(message = "user의 id를 넣어주세요.")
    private Users user;

    public FavoriteProduct toEntity() {
        return FavoriteProduct.builder()
                .product(product)
                .user(user)
                .build();
    }
}

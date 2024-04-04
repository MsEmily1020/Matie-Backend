package com.ost.matie.dto.cart;

import com.ost.matie.domain.cart.Cart;
import com.ost.matie.domain.product.Product;
import com.ost.matie.domain.user.User;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddCartRequest {
    @NotNull(message = "상품의 갯수를 적어주세요.")
    private Long count;

    @NotNull(message = "product의 id를 적어주세요.")
    private Product product;

    @NotNull(message = "user의 id를 적어주세요.")
    private User user;

    public Cart toEntity() {
        return Cart.builder()
                .count(count)
                .product(product)
                .user(user)
                .build();
    }
}

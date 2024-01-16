package com.ost.matie.dto.cart;

import com.ost.matie.domain.cart.Cart;
import com.ost.matie.domain.comment.Comment;
import com.ost.matie.domain.user.Users;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddCartRequest {
    @NotNull(message = "상품 갯수 리스트를 넣어주세요.")
    private List<Long> count;

    @NotNull(message = "상품 리스트를 넣어주세요.")
    private List<Long> products;

    @NotNull(message = "user의 id를 넣어주세요.")
    private Users user;

    public Cart toEntity() {
        return Cart.builder()
                .count(count)
                .products(products)
                .user(user)
                .build();
    }
}

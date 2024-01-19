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
    private List<Long> count;
    private List<Long> products;
    private Users user;

    public Cart toEntity() {
        return Cart.builder()
                .count(count)
                .products(products)
                .user(user)
                .build();
    }
}

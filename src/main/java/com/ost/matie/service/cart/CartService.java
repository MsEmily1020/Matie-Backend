package com.ost.matie.service.cart;

import com.ost.matie.domain.cart.Cart;
import com.ost.matie.domain.comment.Comment;
import com.ost.matie.dto.cart.AddCartRequest;
import com.ost.matie.dto.cart.UpdateCartRequest;
import com.ost.matie.dto.comment.UpdateCommentRequest;
import com.ost.matie.exception.DataNotFoundException;
import com.ost.matie.exception.DuplicateException;
import com.ost.matie.repository.CartRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CartService {
    private final CartRepository cartRepository;

    public Cart save(AddCartRequest request) {
        if(cartRepository.existsByUserId(request.getUser().getId())) throw new DuplicateException("이미 해당 유저의 카트가 존재합니다. update를 해주세요.");
        return cartRepository.save(request.toEntity());
    }

    public Cart findByUserId(Long userId) {
        return cartRepository.findFirstByUserId(userId);
    }

    @Transactional
    public Cart update(Long id, UpdateCartRequest request) {
        Cart cart = cartRepository.findById(id)
                .orElseThrow(() -> new DataNotFoundException("카트 정보를 찾을 수 없습니다. (id : " + id + ")"));

        cart.update(
                request.getCount(),
                request.getProducts()
        );

        return cart;
    }
}

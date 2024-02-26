package com.ost.matie.service.product;

import com.ost.matie.domain.product.Product;
import com.ost.matie.exception.ProductNotFoundException;
import com.ost.matie.repository.product.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FindByIdProductService {
    private final ProductRepository productRepository;

    @Transactional
    public Product execute(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> ProductNotFoundException.EXCEPTION);
    }
}

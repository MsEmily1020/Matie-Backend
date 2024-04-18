package com.ost.matie.service.product;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.domain.product.Product;
import com.ost.matie.exception.ProductNotFoundException;
import com.ost.matie.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;

@TransactionalService
@RequiredArgsConstructor
public class FindByIdProductService {
    private final ProductRepository productRepository;

    public Product execute(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> ProductNotFoundException.EXCEPTION);
    }
}
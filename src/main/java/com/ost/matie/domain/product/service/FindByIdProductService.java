package com.ost.matie.domain.product.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.product.Product;
import com.ost.matie.domain.product.exception.ProductNotFoundException;
import com.ost.matie.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

@ReadOnlyService
@RequiredArgsConstructor
public class FindByIdProductService {
    private final ProductRepository productRepository;

    public Product execute(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> ProductNotFoundException.EXCEPTION);
    }
}

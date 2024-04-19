package com.ost.matie.domain.product.service;

import com.ost.matie.global.annotation.ReadOnlyService;
import com.ost.matie.domain.product.Product;
import com.ost.matie.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ReadOnlyService
@RequiredArgsConstructor
public class FindAllByCategoryIdProductService {
    private final ProductRepository productRepository;

    public List<Product> execute(Long categoryId) {
        return productRepository.findAllByCategoryId(categoryId);
    }
}

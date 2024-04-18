package com.ost.matie.service.product;

import com.ost.matie.annotation.ReadOnlyService;
import com.ost.matie.domain.product.Product;
import com.ost.matie.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ReadOnlyService
@RequiredArgsConstructor
public class FindAllByCategoryIdProductService {
    private final ProductRepository productRepository;

    public List<Product> execute(Integer categoryId) {
        return productRepository.findAllByCategoryId(categoryId);
    }
}

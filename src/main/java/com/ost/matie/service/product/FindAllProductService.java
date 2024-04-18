package com.ost.matie.service.product;

import com.ost.matie.annotation.TransactionalService;
import com.ost.matie.domain.product.Product;
import com.ost.matie.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@TransactionalService
@RequiredArgsConstructor
public class FindAllProductService {
    private final ProductRepository productRepository;

    public List<Product> execute() { return productRepository.findAll(); }
}

package com.ost.matie.service.product;

import com.ost.matie.domain.product.Product;
import com.ost.matie.repository.product.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindAllByCategoryIdProductService {
    private final ProductRepository productRepository;

    @Transactional
    public List<Product> execute(Integer categoryId) {
        return productRepository.findAllByCategoryId(categoryId);
    }
}

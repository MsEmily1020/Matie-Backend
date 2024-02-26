package com.ost.matie.controller.product;

import com.ost.matie.domain.product.Product;
import com.ost.matie.service.product.FindAllByCategoryIdProductService;
import com.ost.matie.service.product.FindAllProductService;
import com.ost.matie.service.product.FindByIdProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {
    private final FindAllProductService findAllProductService;
    private final FindAllByCategoryIdProductService findAllByCategoryIdProductService;
    private final FindByIdProductService findByIdProductService;

    @GetMapping("/product")
    public List<Product> findAllProducts() {
        return findAllProductService.execute();
    }

    @GetMapping("/products/category/{categoryId}")
    public List<Product> findAllByCategoryId(@PathVariable Integer categoryId) {
        return findAllByCategoryIdProductService.execute(categoryId);
    }

    @GetMapping("/product/{id}")
    public Product findProduct(@PathVariable Long id) {
        return findByIdProductService.execute(id);
    }
}

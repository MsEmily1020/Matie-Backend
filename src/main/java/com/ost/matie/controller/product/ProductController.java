package com.ost.matie.controller.product;

import com.ost.matie.domain.product.Product;
import com.ost.matie.service.product.FindAllByCategoryIdProductService;
import com.ost.matie.service.product.FindAllByNameProductService;
import com.ost.matie.service.product.FindAllProductService;
import com.ost.matie.service.product.FindByIdProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
    private final FindAllProductService findAllProductService;
    private final FindAllByCategoryIdProductService findAllByCategoryIdProductService;
    private final FindAllByNameProductService findAllByNameProductService;
    private final FindByIdProductService findByIdProductService;

    @GetMapping
    public List<Product> findAllProducts() {
        return findAllProductService.execute();
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> findAllByCategoryId(@PathVariable Integer categoryId) {
        return findAllByCategoryIdProductService.execute(categoryId);
    }

    @GetMapping("/name")
    public List<Product> findAllByName(@RequestBody Map<String, String> nameMap) {
        return findAllByNameProductService.execute(nameMap.get("name"));
    }

    @GetMapping("/{id}")
    public Product findProduct(@PathVariable Long id) {
        return findByIdProductService.execute(id);
    }
}

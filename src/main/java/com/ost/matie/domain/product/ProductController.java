package com.ost.matie.domain.product;

import com.ost.matie.domain.product.service.FindAllByCategoryIdProductService;
import com.ost.matie.domain.product.service.FindAllByNameProductService;
import com.ost.matie.domain.product.service.FindAllProductService;
import com.ost.matie.domain.product.service.FindByIdProductService;
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
    public List<Product> findAllByCategoryId(@PathVariable Long categoryId) {
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

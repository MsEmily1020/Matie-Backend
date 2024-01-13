package com.ost.matie.controller.product;

import com.ost.matie.domain.point.Point;
import com.ost.matie.domain.product.Product;
import com.ost.matie.dto.point.PointResponse;
import com.ost.matie.dto.product.ProductResponse;
import com.ost.matie.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    @GetMapping("/product/{categoryId}")
    public ResponseEntity<ProductResponse> findAllByCategoryId(@PathVariable Long categoryId) {
        Product product = productService.findAllByCategoryId(categoryId)
        return ResponseEntity.ok().body(new PointResponse(product));
    }
}

package com.ost.matie.controller.product;

import com.ost.matie.domain.community.Community;
import com.ost.matie.domain.point.Point;
import com.ost.matie.domain.product.Product;
import com.ost.matie.dto.community.CommunityResponse;
import com.ost.matie.dto.point.PointResponse;
import com.ost.matie.dto.product.ProductResponse;
import com.ost.matie.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products/category/{categoryId}")
    public ResponseEntity<List<ProductResponse>> findAllByCategoryId(@PathVariable Long categoryId) {
        List<ProductResponse> productResponses = productService.findAllByCategoryId(categoryId)
                .stream()
                .map(ProductResponse::new)
                .toList();

        return ResponseEntity.ok().body(productResponses);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<ProductResponse> findProduct(@PathVariable Long id) {
        Product product = productService.findById(id);

        return ResponseEntity.ok()
                .body(new ProductResponse(product));
    }
}

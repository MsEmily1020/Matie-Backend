package com.ost.matie.domain.product.repository;

import com.ost.matie.domain.product.Product;

import java.util.List;

public interface ProductRepositoryCustom {
    List<Product> findAllByCategoryId(Long categoryId);
    List<Product> findAllByNameContaining(String name);
}

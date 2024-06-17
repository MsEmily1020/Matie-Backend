package com.ost.matie.domain.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ost.matie.global.common.BaseEntity;
import com.ost.matie.domain.favorite_product.FavoriteProduct;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product extends BaseEntity {
    private String name;

    private String description;

    private Long point;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @JsonIgnore
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FavoriteProduct> favoriteProductList;
}

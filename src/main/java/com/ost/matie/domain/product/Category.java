package com.ost.matie.domain.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ost.matie.domain.BaseEntity;
import com.ost.matie.domain.product.Product;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category extends BaseEntity {
    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "category", cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<Product> productList;
}

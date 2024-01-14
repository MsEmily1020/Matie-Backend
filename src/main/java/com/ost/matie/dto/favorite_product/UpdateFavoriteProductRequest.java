package com.ost.matie.dto.favorite_product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateFavoriteProductRequest {
    private List<Long> product;
}

package com.ost.matie.dto.favorite_product;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateFavoriteProductRequest {
    @NotNull(message = "상품 리스트를 넣어주세요.")
    private List<Long> product;
}

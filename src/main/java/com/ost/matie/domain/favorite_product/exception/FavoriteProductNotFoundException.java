package com.ost.matie.domain.favorite_product.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class FavoriteProductNotFoundException extends BusinessException {
    public static final BusinessException EXCEPTION = new FavoriteProductNotFoundException();
    private FavoriteProductNotFoundException() { super(ErrorCode.FAVORITE_PRODUCT_NOT_FOUND); }
}

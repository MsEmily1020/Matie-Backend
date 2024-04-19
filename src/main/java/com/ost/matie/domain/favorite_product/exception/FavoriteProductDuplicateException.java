package com.ost.matie.domain.favorite_product.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class FavoriteProductDuplicateException extends BusinessException {
    public static final BusinessException EXCEPTION = new FavoriteProductDuplicateException();
    private FavoriteProductDuplicateException() { super(ErrorCode.FAVORITE_PRODUCT_DUPLICATE); }
}

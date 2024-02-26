package com.ost.matie.exception;

import com.ost.matie.exception.error.BusinessException;
import com.ost.matie.exception.error.ErrorCode;

public class FavoriteProductDuplicateException extends BusinessException {
    public static final BusinessException EXCEPTION = new FavoriteProductDuplicateException();
    private FavoriteProductDuplicateException() { super(ErrorCode.FAVORITE_PRODUCT_DUPLICATE); }
}

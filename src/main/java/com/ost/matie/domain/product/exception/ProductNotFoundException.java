package com.ost.matie.domain.product.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class ProductNotFoundException extends BusinessException {
    public static final BusinessException EXCEPTION = new ProductNotFoundException();
    private ProductNotFoundException() { super(ErrorCode.PRODUCT_NOT_FOUND); }
}

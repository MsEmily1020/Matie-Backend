package com.ost.matie.domain.cart.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class CartDuplicateException extends BusinessException {
    public static final BusinessException EXCEPTION = new CartDuplicateException();
    private CartDuplicateException() { super(ErrorCode.CART_DUPLICATE); }
}

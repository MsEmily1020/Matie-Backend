package com.ost.matie.exception;

import com.ost.matie.exception.error.BusinessException;
import com.ost.matie.exception.error.ErrorCode;

public class CartDuplicateException extends BusinessException {
    public static final BusinessException EXCEPTION = new CartDuplicateException();
    private CartDuplicateException() { super(ErrorCode.CART_DUPLICATE); }
}

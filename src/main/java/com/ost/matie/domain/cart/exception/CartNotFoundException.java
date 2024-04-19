package com.ost.matie.domain.cart.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class CartNotFoundException extends BusinessException {
    public static final BusinessException EXCEPTION = new CartNotFoundException();
    private CartNotFoundException() { super(ErrorCode.CART_NOT_FOUND); }
}

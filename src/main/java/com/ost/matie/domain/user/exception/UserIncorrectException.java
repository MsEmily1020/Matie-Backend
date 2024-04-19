package com.ost.matie.domain.user.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class UserIncorrectException extends BusinessException {
    public static final BusinessException EXCEPTION = new UserIncorrectException();
    private UserIncorrectException() { super(ErrorCode.USER_INCORRECT); }
}

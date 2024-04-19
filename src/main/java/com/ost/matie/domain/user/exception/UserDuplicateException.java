package com.ost.matie.domain.user.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class UserDuplicateException extends BusinessException {
    public static final BusinessException EXCEPTION = new UserDuplicateException();
    private UserDuplicateException() { super(ErrorCode.USER_DUPLICATE); }
}

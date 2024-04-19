package com.ost.matie.domain.user.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class UserIdDuplicateException extends BusinessException {
    public static final BusinessException EXCEPTION = new UserIdDuplicateException();
    private UserIdDuplicateException() { super(ErrorCode.USERID_DUPLICATE); }
}

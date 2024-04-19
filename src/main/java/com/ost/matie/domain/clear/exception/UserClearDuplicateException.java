package com.ost.matie.domain.clear.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class UserClearDuplicateException extends BusinessException {
    public static final BusinessException EXCEPTION = new UserClearDuplicateException();
    private UserClearDuplicateException() { super(ErrorCode.USER_CLEAR_DUPLICATE); }
}

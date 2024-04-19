package com.ost.matie.domain.email.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class EmailCodeExpiredException extends BusinessException {
    public static final BusinessException EXCEPTION = new EmailCodeExpiredException();
    private EmailCodeExpiredException() { super(ErrorCode.EMAIL_CODE_EXPIRED); }
}

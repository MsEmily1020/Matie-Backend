package com.ost.matie.domain.email.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class EmailDuplicateException extends BusinessException {
    public static final BusinessException EXCEPTION = new EmailDuplicateException();
    private EmailDuplicateException() { super(ErrorCode.EMAIL_DUPLICATE); }
}

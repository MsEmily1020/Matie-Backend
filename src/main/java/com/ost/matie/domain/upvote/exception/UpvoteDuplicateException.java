package com.ost.matie.domain.upvote.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class UpvoteDuplicateException extends BusinessException {
    public static final BusinessException EXCEPTION = new UpvoteDuplicateException();

    private UpvoteDuplicateException() { super(ErrorCode.UPVOTE_DUPLICATE); }
}

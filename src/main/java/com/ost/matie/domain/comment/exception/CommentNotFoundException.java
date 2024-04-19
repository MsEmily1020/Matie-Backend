package com.ost.matie.domain.comment.exception;

import com.ost.matie.global.exception.error.BusinessException;
import com.ost.matie.global.exception.error.ErrorCode;

public class CommentNotFoundException extends BusinessException {
    public static final BusinessException EXCEPTION = new CommentNotFoundException();
    private CommentNotFoundException() { super(ErrorCode.COMMENT_NOT_FOUND); }
}

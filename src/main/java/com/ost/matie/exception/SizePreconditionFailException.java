package com.ost.matie.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
public class SizePreconditionFailException extends RuntimeException {
    public SizePreconditionFailException(String message) {
        super(message);
    }

    public SizePreconditionFailException(String message, Throwable cause) {
        super(message, cause);
    }
}

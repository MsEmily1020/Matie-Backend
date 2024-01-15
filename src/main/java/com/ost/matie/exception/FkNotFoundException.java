package com.ost.matie.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FkNotFoundException extends RuntimeException {
    public FkNotFoundException(String message) {
        super(message);
    }

    public FkNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

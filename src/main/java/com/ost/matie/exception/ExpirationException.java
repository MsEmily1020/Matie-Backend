package com.ost.matie.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.REQUEST_TIMEOUT)
public class ExpirationException extends RuntimeException {

    public ExpirationException(String message) {
        super(message);
    }
}

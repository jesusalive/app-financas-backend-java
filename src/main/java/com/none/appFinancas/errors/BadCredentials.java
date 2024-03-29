package com.none.appFinancas.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadCredentials extends RuntimeException {
    public BadCredentials(String message) {
        super(message);
    }
}
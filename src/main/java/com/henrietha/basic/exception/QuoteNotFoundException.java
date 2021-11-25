package com.henrietha.basic.exception;

public class QuoteNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 235334271386458485L;

    public QuoteNotFoundException(String message) {
        super(message);
    }

    public QuoteNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

}

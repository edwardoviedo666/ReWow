package com.rewow.commons.exceptions;

public class SystemException extends Exception {
    public SystemException(String message) {
        super(message);
    }

    public SystemException(String s, Throwable throwable) {
        super(s, throwable);
    }
}

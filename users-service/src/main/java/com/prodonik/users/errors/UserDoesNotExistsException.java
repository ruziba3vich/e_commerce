package com.prodonik.users.errors;

public class UserDoesNotExistsException extends RuntimeException{
    public UserDoesNotExistsException(String message) {
        super(message);
    }
}

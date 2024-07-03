package com.prodonik.products.errors;

public class CategoryDoesNotExsistException extends Exception {
    public CategoryDoesNotExsistException(String message) {
        super(message);
    }
}

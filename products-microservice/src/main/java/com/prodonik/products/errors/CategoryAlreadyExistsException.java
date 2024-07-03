package com.prodonik.products.errors;

public class CategoryAlreadyExistsException extends Exception {
    public CategoryAlreadyExistsException(String message) {
        super(message);
    }
}

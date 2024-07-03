package com.prodonik.products.errors;

public class ProductDoesNotExsistException extends RuntimeException {
    public ProductDoesNotExsistException(String message) {
        super(message);
    }
}

package com.prodonik.products.errors;

public class ProductsAlreadyExistsException extends RuntimeException {
    public ProductsAlreadyExistsException(String message) {
        super(message);
    }
}

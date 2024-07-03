package com.prodonik.products.service;

import com.google.protobuf.Empty;
import com.prodonik.genprotos.*;
import com.prodonik.genprotos.Products.DeleteProductRequest;
import com.prodonik.genprotos.Products.GetAllProductsResponse;
import com.prodonik.genprotos.Products.Product;
import com.prodonik.genprotos.Products.ProductId;
import com.prodonik.genprotos.Products.ProductName;
import com.prodonik.genprotos.Products.ProductRequest;
import com.prodonik.products.errors.ProductDoesNotExsistException;
import com.prodonik.products.errors.ProductsAlreadyExistsException;
import com.prodonik.products.storage.ProductStorage;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductServiceGrpcImpl extends ProductServiceGrpc.ProductServiceImplBase {
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceGrpcImpl.class);
    private final ProductStorage productStorage;

    public ProductServiceGrpcImpl(ProductStorage productStorage) {
        this.productStorage = productStorage;
    }

    @Override
    public void createProduct(ProductRequest request, StreamObserver<Product> responseObserver) {
        logger.info("CREATE PRODUCT HAS BEEN CALLED");
        try {
            Product createdProduct = productStorage.createProduct(request.getProduct());
            responseObserver.onNext(createdProduct);
            responseObserver.onCompleted();
        } catch (ProductsAlreadyExistsException e) {
            responseObserver.onError(Status.ALREADY_EXISTS.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void updateProduct(ProductRequest request, StreamObserver<Product> responseObserver) {
        logger.info("UPDATE PRODUCT HAS BEEN CALLED");
        try {
            Product updatedProduct = productStorage.updateProductById(UUID.fromString(request.getProduct().getId()), request.getProduct());
            responseObserver.onNext(updatedProduct);
            responseObserver.onCompleted();
        } catch (ProductDoesNotExsistException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void getProductById(ProductId request, StreamObserver<Product> responseObserver) {
        logger.info("GET PRODUCT BY ID HAS BEEN CALLED");
        try {
            Product product = productStorage.getProductById(UUID.fromString(request.getId()));
            responseObserver.onNext(product);
            responseObserver.onCompleted();
        } catch (ProductDoesNotExsistException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void getProductByName(ProductName request, StreamObserver<Product> responseObserver) {
        logger.info("GET PRODUCT BY ID HAS BEEN CALLED");
        try {
            Product product = productStorage.getProductByName(request.getName());
            responseObserver.onNext(product);
            responseObserver.onCompleted();
        } catch (ProductDoesNotExsistException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void deleteProduct(DeleteProductRequest request, StreamObserver<Empty> responseObserver) {
        logger.info("DELETE PRODUCT HAS BEEN CALLED");
        try {
            productStorage.deleteProductById(UUID.fromString(request.getId()));
            responseObserver.onNext(Empty.getDefaultInstance());
            responseObserver.onCompleted();
        } catch (ProductDoesNotExsistException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void getAllProducts(com.google.protobuf.Empty request, StreamObserver<GetAllProductsResponse> streamObserver) {
        logger.info("GET ALL PRODUCTS HAS BEEN CALLED");
        streamObserver.onNext(
            this.productStorage.getAllProducts()
        );
        streamObserver.onCompleted();
    }
}

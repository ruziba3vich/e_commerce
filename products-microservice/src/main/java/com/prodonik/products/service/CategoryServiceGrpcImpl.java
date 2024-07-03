package com.prodonik.products.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.prodonik.genprotos.CategoryServiceGrpc.CategoryServiceImplBase;
import com.prodonik.genprotos.Products.Category;
import com.prodonik.genprotos.Products.CategoryId;
import com.prodonik.genprotos.Products.CategoryName;
import com.prodonik.genprotos.Products.CategoryRequest;
import com.prodonik.genprotos.Products.DeleteCategoryRequest;
import com.prodonik.genprotos.Products.GetAllCategoriesResponse;
import com.prodonik.products.errors.CategoryAlreadyExistsException;
import com.prodonik.products.errors.CategoryDoesNotExsistException;
import com.prodonik.products.storage.CategoryStorage;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

public class CategoryServiceGrpcImpl extends CategoryServiceImplBase {
    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceGrpcImpl.class);
    private final CategoryStorage categoryStorage;

    public CategoryServiceGrpcImpl(CategoryStorage categoryStorage) {
        this.categoryStorage = categoryStorage;
    }

    @Override
    public void createCategory(CategoryRequest request, StreamObserver<Category> responseObserver) {
        logger.info("CREATE CATEGORY HAS BEEN CALLED");
        try {
            Category createdCategory = categoryStorage.createCategory(request.getCategory());
            responseObserver.onNext(createdCategory);
            responseObserver.onCompleted();
        } catch (CategoryAlreadyExistsException e) {
            responseObserver.onError(Status.ALREADY_EXISTS.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void updateCategory(CategoryRequest request, StreamObserver<Category> responseObserver) {
        logger.info("UPDATE CATEGORY HAS BEEN CALLED");
        try {
            Category updatedCategory = categoryStorage.updateCategoryById(UUID.fromString(request.getCategory().getCategoryId()), request.getCategory());
            responseObserver.onNext(updatedCategory);
            responseObserver.onCompleted();
        } catch (CategoryDoesNotExsistException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void getCategoryById(CategoryId request, StreamObserver<Category> responseObserver) {
        logger.info("GET CATEGORY BY ID HAS BEEN CALLED");
        try {
            Category category = categoryStorage.getCategoryById(UUID.fromString(request.getId()));
            responseObserver.onNext(category);
            responseObserver.onCompleted();
        } catch (CategoryDoesNotExsistException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void getCategoryByName(CategoryName request, StreamObserver<Category> responseObserver) {
        logger.info("GET CATEGORY BY NAME HAS BEEN CALLED");
        try {
            Category category = categoryStorage.getCategoryByName(request.getName());
            responseObserver.onNext(category);
            responseObserver.onCompleted();
        } catch (CategoryDoesNotExsistException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void deleteCategory(DeleteCategoryRequest request, StreamObserver<Empty> responseObserver) {
        logger.info("DELETE CATEGORY HAS BEEN CALLED");
        try {
            categoryStorage.deleteCategoryById(UUID.fromString(request.getId()));
            responseObserver.onNext(Empty.getDefaultInstance());
            responseObserver.onCompleted();
        } catch (CategoryDoesNotExsistException e) {
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void getAllCategories(com.google.protobuf.Empty request, StreamObserver<GetAllCategoriesResponse> streamObserver) {
        logger.info("GET ALL CATEGORIES HAS BEEN CALLED");
        streamObserver.onNext(
            this.categoryStorage.getAllCategories()
        );
        streamObserver.onCompleted();
    }
}

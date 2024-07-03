package com.prodonik.runner;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.prodonik.products.repo.CategoryRepo;
import com.prodonik.products.repo.ProductRepo;
import com.prodonik.products.service.CategoryServiceGrpcImpl;
import com.prodonik.products.service.ProductServiceGrpcImpl;
import com.prodonik.products.storage.CategoryStorage;
import com.prodonik.products.storage.ProductStorage;

@Configuration
@EnableJpaRepositories(basePackageClasses = {ProductRepo.class, CategoryRepo.class})
public class GrpcServerConfig {

    private final ProductStorage productStorage;
    private final CategoryStorage categoryStorage;

    public GrpcServerConfig(ProductStorage productStorage, CategoryStorage categoryStorage) {
        this.productStorage = productStorage;
        this.categoryStorage = categoryStorage;
    }

    public Server grpcServer() {
        return ServerBuilder.forPort(5001)
                .addService(new ProductServiceGrpcImpl(productStorage))
                .addService(new CategoryServiceGrpcImpl(categoryStorage))
                .build();
    }
}

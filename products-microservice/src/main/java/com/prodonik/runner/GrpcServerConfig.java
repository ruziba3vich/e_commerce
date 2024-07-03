package com.prodonik.runner;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.prodonik.products.repo.CategoryRepo;
import com.prodonik.products.repo.HistoryRepo;
import com.prodonik.products.repo.ProductRepo;
import com.prodonik.products.repo.PurchaseRepo;
import com.prodonik.products.service.CategoryServiceGrpcImpl;
import com.prodonik.products.service.HistoryServiceGrpcImpl;
import com.prodonik.products.service.ProductServiceGrpcImpl;
import com.prodonik.products.service.PurchaseServiceImpl;
import com.prodonik.products.storage.CategoryStorage;
import com.prodonik.products.storage.HistoryStorage;
import com.prodonik.products.storage.ProductStorage;
import com.prodonik.products.storage.PurchaseStorage;

@Configuration
@EnableJpaRepositories(basePackageClasses = {
        ProductRepo.class,
        CategoryRepo.class,
        HistoryRepo.class,
        PurchaseRepo.class
    }
)
public class GrpcServerConfig {

    private final ProductStorage productStorage;
    private final CategoryStorage categoryStorage;
    private final HistoryStorage historyStorage;
    private final PurchaseStorage purchaseStorage;

    public GrpcServerConfig(
        ProductStorage productStorage,
        CategoryStorage categoryStorage,
        HistoryStorage historyStorage,
        PurchaseStorage purchaseStorage) {
        this.productStorage = productStorage;
        this.categoryStorage = categoryStorage;
        this.historyStorage = historyStorage;
        this.purchaseStorage = purchaseStorage;
    }

    public Server grpcServer() {
        return ServerBuilder.forPort(5001)
                .addService(new ProductServiceGrpcImpl(this.productStorage))
                .addService(new CategoryServiceGrpcImpl(this.categoryStorage))
                .addService(new HistoryServiceGrpcImpl(this.historyStorage))
                .addService(new PurchaseServiceImpl(this.purchaseStorage))
                .build();
    }
}

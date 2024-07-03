package com.prodonik.products.storage;

import com.google.protobuf.Timestamp;
import com.prodonik.genprotos.Products.CreateProductsHistoryRequest;
import com.prodonik.genprotos.Products.CreateProductsHistoryResponse;
import com.prodonik.genprotos.Products.RemoveProductsRequest;
import com.prodonik.products.repo.PurchaseRepo;

import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import java.time.ZoneOffset;

@AllArgsConstructor
@Transactional
@Service
public class PurchaseStorage {
    private PurchaseRepo purchaseRepo;
    private HistoryStorage historyStorage;

    public boolean removeProducts(RemoveProductsRequest request) throws RuntimeException {
        try {
            int rowsAffected = this.purchaseRepo.updateProductStock(
            request.getNumberOfProducts(),
            UUID.fromString(request.getProductId())
            );
            if (rowsAffected > 0) {
                LocalDateTime time = LocalDateTime.now();
                CreateProductsHistoryRequest createRequest = CreateProductsHistoryRequest.newBuilder()
                                                                                            .setProductId(request.getProductId())
                                                                                            .setNumberOfBoughtProducts(request.getNumberOfProducts())
                                                                                            .setClientId(request.getClientId())
                                                                                            .setBoughtAt(
                                                                                                Timestamp.newBuilder()
                                                                                                            .setSeconds(time.toEpochSecond(ZoneOffset.UTC))
                                                                                                            .setNanos(time.getNano())
                                                                                                            .build()
                                                                                            ).build();
                CreateProductsHistoryResponse response = this.historyStorage.createProductsHistory(createRequest);
                return response.getNumberOfBoughtProducts() == 0;
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return false;
    }
}

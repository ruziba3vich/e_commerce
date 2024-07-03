package com.prodonik.products.storage;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.prodonik.genprotos.Products.CreateProductsHistoryRequest;
import com.prodonik.genprotos.Products.CreateProductsHistoryResponse;
import com.prodonik.genprotos.Products.GetProductsHistoryRequest;
import com.prodonik.genprotos.Products.GetProductsHistoryResponse;
import com.prodonik.products.convertor.Converter;
import com.prodonik.products.entities.EHistory;
import com.prodonik.products.repo.HistoryRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HistoryStorage {

    private HistoryRepo historyRepo;
    private Converter converter;

    public GetProductsHistoryResponse getHistoryByClientId(GetProductsHistoryRequest request) {
        List<EHistory> products = this.historyRepo.getByClientId(UUID.fromString(request.getClientId()));

        return GetProductsHistoryResponse.newBuilder()
                                            .addAllProducts(
                                                products.stream()
                                                        .map(p -> this.converter.EHistorytoProto(p))
                                                        .collect(Collectors.toList())
                                            ).build();
    }

    public CreateProductsHistoryResponse createProductsHistory(CreateProductsHistoryRequest request) {
        return this.converter.EHistorytoProto(
            this.historyRepo.save(
                this.converter.protoHistoryToEntiry(request)
            )
        );
    }
}

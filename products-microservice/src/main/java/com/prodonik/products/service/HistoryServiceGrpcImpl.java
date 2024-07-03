package com.prodonik.products.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.prodonik.genprotos.HistoryServiceGrpc.HistoryServiceImplBase;
import com.prodonik.genprotos.Products.CreateProductsHistoryRequest;
import com.prodonik.genprotos.Products.CreateProductsHistoryResponse;
import com.prodonik.genprotos.Products.GetProductsHistoryRequest;
import com.prodonik.genprotos.Products.GetProductsHistoryResponse;
import com.prodonik.products.storage.HistoryStorage;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HistoryServiceGrpcImpl extends HistoryServiceImplBase {
    private static final Logger logger = LoggerFactory.getLogger(HistoryServiceGrpcImpl.class);
    private HistoryStorage historyStorage;

    @Override
    public void getProductsHistory(GetProductsHistoryRequest request, StreamObserver<GetProductsHistoryResponse> respObserver) {
        logger.info("GET HISTORY BY CLIENT ID HAS BEEN CALLED");
        respObserver.onNext(
            this.historyStorage.getHistoryByClientId(request)
        );
        respObserver.onCompleted();
    }

    @Override
    public void createHistory(CreateProductsHistoryRequest request, StreamObserver<CreateProductsHistoryResponse> responseObserver) {
        logger.info("CREATE HISTORY HAS BEEN CALLED");
        try {
            CreateProductsHistoryResponse response = this.historyStorage.createProductsHistory(request);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            // logger.info(response.getBoughtAt().toString());
        } catch (RuntimeException e) {
            logger.info("EROR OCCURED ----------------------------> " + e.getMessage());
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(e.getMessage()).asException());
        }
    }
}

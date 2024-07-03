package com.prodonik.products.service;

import com.prodonik.genprotos.Products.RemoveProductsRequest;
import com.prodonik.genprotos.Products.RemoveProductsResponse;
import com.prodonik.genprotos.PurchaseServiceGrpc.PurchaseServiceImplBase;
import com.prodonik.products.storage.PurchaseStorage;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PurchaseServiceImpl extends PurchaseServiceImplBase {
    private PurchaseStorage purchaseStorage;

    public void removeProducts(RemoveProductsRequest request, StreamObserver<RemoveProductsResponse> streamObserver) {
        try {
            boolean serverResponse = this.purchaseStorage.removeProducts(request);
            RemoveProductsResponse response = RemoveProductsResponse.newBuilder()
                                                                    .setMessage("Purchase has successfully been created")
                                                                    .setErrorOccured(serverResponse)
                                                                    .build();
            streamObserver.onNext(response);
            streamObserver.onCompleted();
        } catch (Exception e) {
            streamObserver.onError(
                Status.INTERNAL.withDescription(e.getMessage()).asException()
            );
        }
    }
}

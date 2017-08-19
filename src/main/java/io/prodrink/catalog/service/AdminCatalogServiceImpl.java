package io.prodrink.catalog.service;

import io.grpc.stub.StreamObserver;
import io.prodrink.catalog.domain.Drink;
import io.prodrink.catalog.dto.*;
import org.springframework.stereotype.Service;

@Service
public class AdminCatalogServiceImpl extends AdminCatalogServiceGrpc.AdminCatalogServiceImplBase {
    @Override
    public void createDrink(Drink request, StreamObserver<DrinkCreationResponse> responseObserver) {
        // TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public void updateDrink(DrinkUpdateRequest request, StreamObserver<DrinkUpdateResponse> responseObserver) {
        // TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public StreamObserver<DrinkDeletionRequest> deleteDrink(StreamObserver<DrinkDeletionResponse> responseObserver) {
        // TODO
        throw new UnsupportedOperationException();
    }
}

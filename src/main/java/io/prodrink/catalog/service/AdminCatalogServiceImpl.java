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
    }

    @Override
    public void updateDrink(DrinkUpdateRequest request, StreamObserver<DrinkUpdateResponse> responseObserver) {
        // TODO
    }

    @Override
    public StreamObserver<DrinkDeletionRequest> deleteDrink(StreamObserver<DrinkDeletionResponse> responseObserver) {
        // TODO
        return null;
    }
}

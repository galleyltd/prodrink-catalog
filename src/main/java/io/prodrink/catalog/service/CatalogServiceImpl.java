package io.prodrink.catalog.service;

import io.grpc.stub.StreamObserver;
import io.prodrink.catalog.domain.Drink;
import io.prodrink.catalog.dto.DrinkPageRequest;
import io.prodrink.catalog.dto.DrinkRequest;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl extends CatalogServiceGrpc.CatalogServiceImplBase {
    @Override
    public StreamObserver<DrinkRequest> getDrinksById(StreamObserver<Drink> responseObserver) {
        return null;
    }

    @Override
    public void getDrinksPage(DrinkPageRequest request, StreamObserver<Drink> responseObserver) {

    }
}

package io.prodrink.catalog.service;

import io.grpc.stub.StreamObserver;
import io.prodrink.catalog.converter.Converters;
import io.prodrink.catalog.domain.Drink;
import io.prodrink.catalog.dto.DrinkPageRequest;
import io.prodrink.catalog.dto.DrinkRequest;
import io.prodrink.catalog.entity.DrinkEntity;
import io.prodrink.catalog.repository.DrinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl extends CatalogServiceGrpc.CatalogServiceImplBase {
    private static final Logger log = LoggerFactory.getLogger(CatalogServiceImpl.class);

    @Autowired
    private DrinkRepository drinkRepository;

    @Autowired
    private Converters converters;

    @Override
    public StreamObserver<DrinkRequest> getDrinksById(StreamObserver<Drink> responseObserver) {
        return new StreamObserver<DrinkRequest>() {
            @Override
            public void onNext(DrinkRequest value) {
                String userId = value.getUserId(); // TODO:
                DrinkEntity entity = drinkRepository.findOne(value.getDrinkId());
                responseObserver.onNext(converters.getDrinkFromEntity(entity));
            }

            @Override
            public void onError(Throwable t) {
                log.error("Error occurred", t);
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void getDrinksPage(DrinkPageRequest request, StreamObserver<Drink> responseObserver) {
        // hello non-reactive jdbc :-(
        try {
            String userId = request.getUserId(); // TODO
            PageRequest pageable = new PageRequest(request.getPageNumber(), request.getPerPage());
            for (DrinkEntity entity : drinkRepository.findAll(pageable)) {
                responseObserver.onNext(converters.getDrinkFromEntity(entity));
            }
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
}

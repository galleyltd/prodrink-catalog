package io.prodrink.catalog.service;

import io.grpc.stub.StreamObserver;
import io.prodrink.catalog.converter.Converters;
import io.prodrink.catalog.entity.DrinkEntity;
import io.prodrink.catalog.generated.domain.Drink;
import io.prodrink.catalog.generated.dto.CategoryTree;
import io.prodrink.catalog.generated.dto.CategoryTreeRequest;
import io.prodrink.catalog.generated.dto.DrinkRequest;
import io.prodrink.catalog.generated.dto.DrinksFromCategoryRequest;
import io.prodrink.catalog.generated.service.CatalogServiceGrpc;
import io.prodrink.catalog.repository.DrinkRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CatalogServiceImpl extends CatalogServiceGrpc.CatalogServiceImplBase {
    private final DrinkRepository drinkRepository;
    private final Converters converters;
    private final CategoryTreeCacheHolder categoryTreeCacheHolder;

    @Autowired
    public CatalogServiceImpl(
            DrinkRepository drinkRepository,
            Converters converters,
            CategoryTreeCacheHolder categoryTreeCacheHolder
    ) {
        this.drinkRepository = drinkRepository;
        this.converters = converters;
        this.categoryTreeCacheHolder = categoryTreeCacheHolder;
    }

    @Override
    public void getDrinkById(DrinkRequest request, StreamObserver<Drink> responseObserver) {
        try {
            String userId = request.getUserId(); // TODO:
            DrinkEntity entity = drinkRepository.findOne(request.getDrinkId());
            responseObserver.onNext(converters.convertEntityToDomain(entity));
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void getDrinksFromCategory(DrinksFromCategoryRequest request, StreamObserver<Drink> responseObserver) {
        String userId = request.getUserId(); // TODO:
        int perPage = request.getPerPage();
        if (perPage == 0) perPage = 20;
        PageRequest pageable = new PageRequest(request.getPageNumber(), perPage);
        drinkRepository.getDrinksFromCategory(request.getCategoryId(), pageable)
                .stream()
                .map(converters::convertEntityToDomain)
                .forEach(responseObserver::onNext);
        responseObserver.onCompleted();
    }

    @Override
    public void getCategoryTree(CategoryTreeRequest request, StreamObserver<CategoryTree> responseObserver) {
        responseObserver.onNext(categoryTreeCacheHolder.getCategoryTree());
        responseObserver.onCompleted();
    }
}

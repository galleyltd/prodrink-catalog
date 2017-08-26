package io.prodrink.catalog.service;

import io.grpc.stub.StreamObserver;
import io.prodrink.catalog.converter.Converters;
import io.prodrink.catalog.entity.DrinkEntity;
import io.prodrink.catalog.generated.domain.Category;
import io.prodrink.catalog.generated.domain.Drink;
import io.prodrink.catalog.generated.dto.DrinkRequest;
import io.prodrink.catalog.generated.dto.DrinksFromCategoryRequest;
import io.prodrink.catalog.generated.dto.TopLevelCategoriesRequest;
import io.prodrink.catalog.generated.service.CatalogServiceGrpc;
import io.prodrink.catalog.repository.CategoryRepository;
import io.prodrink.catalog.repository.DrinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl extends CatalogServiceGrpc.CatalogServiceImplBase {
    private static final Logger log = LoggerFactory.getLogger(CatalogServiceImpl.class);

    private final DrinkRepository drinkRepository;
    private final CategoryRepository categoryRepository;
    private final Converters converters;

    @Autowired
    public CatalogServiceImpl(
            DrinkRepository drinkRepository,
            CategoryRepository categoryRepository,
            Converters converters
    ) {
        this.drinkRepository = drinkRepository;
        this.categoryRepository = categoryRepository;
        this.converters = converters;
    }

    @Override
    public void getDrinkById(DrinkRequest request, StreamObserver<Drink> responseObserver) {
        try {
            String userId = request.getUserId(); // TODO:
            DrinkEntity entity = drinkRepository.findOne(request.getDrinkId());
            responseObserver.onNext(converters.getDrinkFromEntity(entity));
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void getTopLevelCategories(TopLevelCategoriesRequest request, StreamObserver<Category> responseObserver) {
        categoryRepository.getTopLevelCategories()
                .stream()
                .map(converters::getCategoryFromEntity)
                .forEach(responseObserver::onNext);
        responseObserver.onCompleted();
    }

    @Override
    public void getDrinksFromCategory(DrinksFromCategoryRequest request, StreamObserver<Drink> responseObserver) {
        String userId = request.getUserId(); // TODO:
        PageRequest pageable = new PageRequest(request.getPageNumber(), request.getPerPage());
        drinkRepository.getDrinksFromCategory(request.getCategoryId(), pageable)
                .stream()
                .map(converters::getDrinkFromEntity)
                .forEach(responseObserver::onNext);
        responseObserver.onCompleted();
    }
}

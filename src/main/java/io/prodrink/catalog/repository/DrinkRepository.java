package io.prodrink.catalog.repository;

import io.prodrink.catalog.entity.DrinkEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DrinkRepository extends PagingAndSortingRepository<DrinkEntity, Integer> {

}

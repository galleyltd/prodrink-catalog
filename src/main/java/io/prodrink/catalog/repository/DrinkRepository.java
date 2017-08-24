package io.prodrink.catalog.repository;

import io.prodrink.catalog.entity.DrinkEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface DrinkRepository extends PagingAndSortingRepository<DrinkEntity, Integer> {
    @Query("SELECT d FROM DrinkEntity d where d.categoryEntity.id = ?1")
    List<DrinkEntity> getDrinksFromCategory(int categoryId, Pageable pageable);
}

package io.prodrink.catalog.repository;

import io.prodrink.catalog.entity.CategoryEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer> {
    @Query("SELECT c FROM CategoryEntity c where c.parentCategoryEntity is null")
    List<CategoryEntity> getTopLevelCategories();
}

package io.prodrink.catalog.repository;

import io.prodrink.catalog.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer> {

}

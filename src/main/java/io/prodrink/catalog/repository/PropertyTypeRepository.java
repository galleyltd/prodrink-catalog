package io.prodrink.catalog.repository;

import io.prodrink.catalog.entity.CategoryEntity;
import io.prodrink.catalog.entity.PropertyTypeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PropertyTypeRepository extends CrudRepository<PropertyTypeEntity, Integer> {
    List<PropertyTypeEntity> findAllByCategory(CategoryEntity category);
}

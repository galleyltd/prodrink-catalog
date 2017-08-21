package io.prodrink.catalog.repository;

import io.prodrink.catalog.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;

public interface PropertyRepository extends CrudRepository<PropertyEntity, Integer> {

}

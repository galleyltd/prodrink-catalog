package io.prodrink.catalog.converter;

import io.prodrink.catalog.entity.CategoryEntity;
import io.prodrink.catalog.entity.DrinkEntity;
import io.prodrink.catalog.entity.PropertyEntity;
import io.prodrink.catalog.entity.PropertyTypeEntity;
import io.prodrink.catalog.generated.domain.*;
import io.prodrink.catalog.repository.PropertyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Converters {
    private final PropertyTypeRepository propertyTypeRepository;

    @Autowired
    public Converters(PropertyTypeRepository propertyTypeRepository) {
        this.propertyTypeRepository = propertyTypeRepository;
    }

    public Drink getDrinkFromEntity(DrinkEntity entity) {
        CategoryEntity categoryEntity = entity.getCategoryEntity();
        List<PropertyEntity> properties = entity.getProperties();

        return Drink.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName())
                .setDescription(entity.getDescription())
                .addAllImageUrls(Arrays.asList(entity.getImageUrls().split(";")))
                .addAllProperties(properties.stream().map(this::getPropertyFromEntity).collect(Collectors.toList()))
                .setCategory(getCategoryFromEntity(categoryEntity))
                .build();
    }

    public Property getPropertyFromEntity(PropertyEntity entity) {
        return Property.newBuilder()
                .setId(entity.getId())
                .setPropertyType(getPropertyTypeFromEntity(entity.getPropertyTypeEntity()))
                .setValue(entity.getValue())
                .build();
    }

    public PropertyType getPropertyTypeFromEntity(PropertyTypeEntity entity) {
        return PropertyType.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName())
                .setType(ValueType.valueOf(entity.getValueType()))
                .build();
    }

    public Category getCategoryFromEntity(CategoryEntity entity) {
        List<PropertyType> propertyTypes = propertyTypeRepository.findAllByCategory(entity)
                .stream()
                .map(this::getPropertyTypeFromEntity)
                .collect(Collectors.toList());
        Category.Builder builder = Category.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName())
                .addAllPropertyTypes(propertyTypes);
        CategoryEntity parentCategoryEntity = entity.getParentCategoryEntity();
        if (parentCategoryEntity != null) {
            builder.setParentCategory(getCategoryFromEntity(parentCategoryEntity));
        }
        return builder.build();
    }
}

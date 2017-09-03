package io.prodrink.catalog.converter;

import io.prodrink.catalog.entity.CategoryEntity;
import io.prodrink.catalog.entity.DrinkEntity;
import io.prodrink.catalog.entity.PropertyEntity;
import io.prodrink.catalog.entity.PropertyTypeEntity;
import io.prodrink.catalog.generated.domain.*;
import io.prodrink.catalog.generated.dto.CategoryDto;
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

    public Drink convertEntityToDomain(DrinkEntity entity) {
        CategoryEntity categoryEntity = entity.getCategoryEntity();
        List<PropertyEntity> properties = entity.getProperties();

        return Drink.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName())
                .setDescription(entity.getDescription())
                .addAllImageUrls(Arrays.asList(entity.getImageUrls().split(";")))
                .addAllProperties(properties.stream().map(this::convertEntityToDomain).collect(Collectors.toList()))
                .setCategory(convertEntityToDomain(categoryEntity))
                .build();
    }

    public Property convertEntityToDomain(PropertyEntity entity) {
        return Property.newBuilder()
                .setId(entity.getId())
                .setPropertyType(convertEntityToDomain(entity.getPropertyTypeEntity()))
                .setValue(entity.getValue())
                .build();
    }

    public PropertyType convertEntityToDomain(PropertyTypeEntity entity) {
        return PropertyType.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName())
                .setType(ValueType.valueOf(entity.getValueType()))
                .build();
    }

    public Category convertEntityToDomain(CategoryEntity entity) {
        List<PropertyType> propertyTypes = propertyTypeRepository.findAllByCategory(entity)
                .stream()
                .map(this::convertEntityToDomain)
                .collect(Collectors.toList());
        Category.Builder builder = Category.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName())
                .addAllPropertyTypes(propertyTypes);
        CategoryEntity parentCategoryEntity = entity.getParentCategoryEntity();
        if (parentCategoryEntity != null) {
            builder.setParentCategory(convertEntityToDomain(parentCategoryEntity));
        }
        return builder.build();
    }

    public CategoryDto convertEntityToDto(CategoryEntity entity) {
        CategoryDto.Builder builder = CategoryDto.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName());
        if (entity.getImageUrl() != null) {
            builder.setImageUrl(entity.getImageUrl());
        }
        return builder.build();
    }
}

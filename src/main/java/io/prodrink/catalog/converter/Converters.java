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

    public Drink getDomainDrinkFromEntity(DrinkEntity entity) {
        CategoryEntity categoryEntity = entity.getCategoryEntity();
        List<PropertyEntity> properties = entity.getProperties();

        return Drink.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName())
                .setDescription(entity.getDescription())
                .addAllImageUrls(Arrays.asList(entity.getImageUrls().split(";")))
                .addAllProperties(properties.stream().map(this::getDomainPropertyFromEntity).collect(Collectors.toList()))
                .setCategory(getDomainCategoryFromEntity(categoryEntity))
                .build();
    }

    public DrinkEntity getEntityFromDomainDrink(Drink drink) {
//        DrinkEntity drinkEntity = new DrinkEntity()
        return null;
    }

    public Property getDomainPropertyFromEntity(PropertyEntity entity) {
        return Property.newBuilder()
                .setId(entity.getId())
                .setPropertyType(getDomainPropertyTypeFromEntity(entity.getPropertyTypeEntity()))
                .setValue(entity.getValue())
                .build();
    }

    public PropertyEntity getEntityFromDomainProperty(Property property) {
        return null;
    }

    public PropertyType getDomainPropertyTypeFromEntity(PropertyTypeEntity entity) {
        return PropertyType.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName())
                .setType(ValueType.valueOf(entity.getValueType()))
                .build();
    }

    public PropertyTypeEntity getEntityFromDomainPropertyType(PropertyType propertyType) {
        return null;
    }

    public Category getDomainCategoryFromEntity(CategoryEntity entity) {
        List<PropertyType> propertyTypes = propertyTypeRepository.findAllByCategory(entity)
                .stream()
                .map(this::getDomainPropertyTypeFromEntity)
                .collect(Collectors.toList());
        Category.Builder builder = Category.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName())
                .addAllPropertyTypes(propertyTypes);
        CategoryEntity parentCategoryEntity = entity.getParentCategoryEntity();
        if (parentCategoryEntity != null) {
            builder.setParentCategory(getDomainCategoryFromEntity(parentCategoryEntity));
        }
        return builder.build();
    }

    public CategoryEntity getEntityFromDomainCategory(Category category) {
        return null;
    }
}

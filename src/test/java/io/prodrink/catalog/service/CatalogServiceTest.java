package io.prodrink.catalog.service;

import io.prodrink.catalog.entity.CategoryEntity;
import io.prodrink.catalog.entity.DrinkEntity;
import io.prodrink.catalog.entity.PropertyEntity;
import io.prodrink.catalog.repository.CategoryRepository;
import io.prodrink.catalog.repository.DrinkRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@DataJpaTest
@Sql(scripts = "classpath:data.sql")
public class CatalogServiceTest {
    @Autowired
    private DrinkRepository drinkRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void shouldCorrectlyGetAllDrinkData() {
        Integer id = 1;
        DrinkEntity drink = drinkRepository.findOne(id);
        assertEquals("My Beer", drink.getName());
        assertEquals("its my beer", drink.getDescription());
        assertEquals(id, drink.getId());
        assertEquals("imgur.com/url", drink.getImageUrls());
        assertEquals((Integer) 1, drink.getCategoryEntity().getParentCategoryEntity().getId());
        assertEquals((Integer) 2, drink.getCategoryEntity().getId());
        assertEquals(2, drink.getProperties().size());
        List<PropertyEntity> properties = new ArrayList<>(drink.getProperties());
        properties.sort(Comparator.comparingInt(PropertyEntity::getId));

        PropertyEntity property1 = properties.get(0);
        PropertyEntity property2 = properties.get(1);

        assertEquals((Integer) 1, property1.getId());
        assertEquals((Integer) 2, property2.getId());

        assertEquals((Integer) 1, property1.getPropertyTypeEntity().getCategory().getId());
        assertEquals((Integer) 2, property2.getPropertyTypeEntity().getCategory().getId());
    }

    @Test
    public void shouldCorrectlyReturnTopLevelCategories() {
        List<CategoryEntity> topLevelCategories = categoryRepository.getTopLevelCategories();
        assertEquals(1, topLevelCategories.size());

        CategoryEntity category = topLevelCategories.get(0);
        assertEquals((Integer) 1, category.getId());
        assertNull(category.getParentCategoryEntity());
        assertEquals("Beer", category.getName());
    }

    @Test
    public void shouldCorrectlyReturnDrinksFromCategory() {
        List<DrinkEntity> drinks = drinkRepository.getDrinksFromCategory(2, new PageRequest(0, 10));
        assertEquals(2, drinks.size());
    }
}

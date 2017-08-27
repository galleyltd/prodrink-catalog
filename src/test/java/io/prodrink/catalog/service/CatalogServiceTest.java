package io.prodrink.catalog.service;

import io.prodrink.catalog.converter.Converters;
import io.prodrink.catalog.entity.DrinkEntity;
import io.prodrink.catalog.repository.DrinkRepository;
import io.prodrink.catalog.repository.PropertyTypeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@Sql(scripts = "classpath:data.sql")
public class CatalogServiceTest {
    @Autowired
    private DrinkRepository drinkRepository;

    @Autowired
    private PropertyTypeRepository propertyTypeRepository;

    private Converters converters;

    @Before
    public void setup() {
        converters = new Converters(propertyTypeRepository);
    }

    @Test
    public void method() {
        DrinkEntity one = drinkRepository.findOne(1);
        assertEquals(one.getName(), "My Beer");
    }
}

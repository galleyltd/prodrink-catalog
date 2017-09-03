package io.prodrink.catalog.service;

import io.prodrink.catalog.converter.Converters;
import io.prodrink.catalog.generated.dto.CategoryNode;
import io.prodrink.catalog.generated.dto.CategoryTree;
import io.prodrink.catalog.repository.CategoryRepository;
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
@Sql(scripts = "classpath:categories.sql")
public class CategoryTreeServiceTest {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private PropertyTypeRepository propertyTypeRepository;

    private CategoryTreeService categoryTreeService;

    @Before
    public void setup() {
        Converters converters = new Converters(propertyTypeRepository);
        categoryTreeService = new CategoryTreeService(categoryRepository, converters);
    }

    @Test
    public void shouldCorrectlyBuildTree() {
        CategoryTree categoryTree = categoryTreeService.buildTree();
        int firstTopLevelCategoryId = 1;

        assertEquals(2, categoryTree.getTopCategoryNodesCount());

        CategoryNode firstTopLevelCategory = categoryTree.getTopCategoryNodes(0);
        CategoryNode firstLevelChild = firstTopLevelCategory.getChildren(0);

        assertEquals(2, firstTopLevelCategory.getChildrenCount());
        assertEquals(firstTopLevelCategoryId, firstLevelChild.getParentId());

        CategoryNode secondLevelChild = firstLevelChild.getChildren(0);
        assertEquals(firstLevelChild.getValue().getId(), secondLevelChild.getParentId());
    }
}

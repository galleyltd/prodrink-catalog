package io.prodrink.catalog.service;

import com.google.common.base.Stopwatch;
import io.prodrink.catalog.converter.Converters;
import io.prodrink.catalog.entity.CategoryEntity;
import io.prodrink.catalog.generated.dto.CategoryNode;
import io.prodrink.catalog.generated.dto.CategoryTree;
import io.prodrink.catalog.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CategoryTreeService {
    private final CategoryRepository categoryRepository;
    private final Converters converters;

    @Autowired
    public CategoryTreeService(CategoryRepository categoryRepository, Converters converters) {
        this.categoryRepository = categoryRepository;
        this.converters = converters;
    }

    public CategoryTree buildTree() {
        Stopwatch sw = Stopwatch.createStarted();

        List<CategoryNode> categories = categoryRepository.getTopLevelCategories().stream()
                .map(this::buildTopLevelCategoryNode)
                .collect(Collectors.toList());

        CategoryTree categoryTree = CategoryTree.newBuilder()
                .addAllTopCategoryNodes(categories)
                .build();

        sw.stop();
        log.info("Category tree building took {}", sw.toString());
        return categoryTree;
    }

    private CategoryNode buildTopLevelCategoryNode(CategoryEntity entity) {
        return CategoryNode.newBuilder()
                .setValue(converters.convertEntityToDto(entity))
                .addAllChildren(getAllChildrenNodes(entity))
                .build();
    }

    private List<CategoryNode> getAllChildrenNodes(CategoryEntity entity) {
        return categoryRepository.getAllByParentCategoryEntity_Id(entity.getId())
                .stream()
                .map(node -> convertChildEntityToNode(node, entity.getId()))
                .collect(Collectors.toList());
    }

    private CategoryNode convertChildEntityToNode(CategoryEntity entity, int parentId) {
        return CategoryNode.newBuilder()
                .setValue(converters.convertEntityToDto(entity))
                .setParentId(parentId)
                .addAllChildren(getAllChildrenNodes(entity))
                .build();
    }
}

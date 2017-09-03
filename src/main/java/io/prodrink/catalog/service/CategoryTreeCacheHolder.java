package io.prodrink.catalog.service;

import io.prodrink.catalog.generated.dto.CategoryTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicReference;

@Service
public class CategoryTreeCacheHolder {
    private final CategoryTreeService categoryTreeService;
    private final AtomicReference<CategoryTree> categoryTree = new AtomicReference<>();

    @Autowired
    public CategoryTreeCacheHolder(CategoryTreeService categoryTreeService) {
        this.categoryTreeService = categoryTreeService;
    }

    @Scheduled(fixedDelay = 60_000L)
    private void fillCache() {
        categoryTree.set(categoryTreeService.buildTree());
    }

    public CategoryTree getCategoryTree() {
        return categoryTree.get();
    }
}

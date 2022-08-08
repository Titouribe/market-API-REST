package com.market.app.model.factory;

import com.market.app.model.dtos.CategoryDTO;
import com.market.app.model.entities.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryFactory {

    private final ProductFactory productFactory;
    public Category create(CategoryDTO categoryDTO){

        return categoryDTO != null ?
                Category.builder()
                        .idCategory(categoryDTO.getIdCategory())
                        .description(categoryDTO.getDescription())
                        .categoryStatus(categoryDTO.getCategoryStatus())
                        .products(categoryDTO.getProductDTOList()
                                .stream()
                                .map(productFactory::create).toList())
                        .build() : null;
    }

    public CategoryDTO create(Category category){

        return category != null ?
                CategoryDTO.builder()
                        .idCategory(category.getIdCategory())
                        .categoryStatus(category.getCategoryStatus())
                        .description(category.getDescription())
                        .productDTOList(category.getProducts()
                                .stream()
                                .map(productFactory::create).toList())
                        .build() : null;
    }
}

package com.market.app.model.factory;

import com.market.app.model.dtos.CategoryDTO;
import com.market.app.model.entities.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryFactory {

    public Category create(CategoryDTO categoryDTO){

        return categoryDTO != null ?
                Category.builder()
                        .idCategory(categoryDTO.getIdCategory())
                        .description(categoryDTO.getDescription())
                        .categoryStatus(categoryDTO.getCategoryStatus())
                        .build() : null;
    }

    public CategoryDTO create(Category category){

        return category != null ?
                CategoryDTO.builder()
                        .idCategory(category.getIdCategory())
                        .categoryStatus(category.getCategoryStatus())
                        .description(category.getDescription())
                        .build() : null;
    }
}

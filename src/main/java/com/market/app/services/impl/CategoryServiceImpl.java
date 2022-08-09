package com.market.app.services.impl;

import com.market.app.model.factory.CategoryFactory;
import com.market.app.repository.ICategoryRepository;
import com.market.app.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Autowired
    private CategoryFactory categoryFactory;


}

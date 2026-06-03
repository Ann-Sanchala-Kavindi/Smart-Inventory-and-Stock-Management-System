package com.Smart.Inventory.Prediction.System.service.impl;

import com.Smart.Inventory.Prediction.System.controller.request.CategoryRequest;
import com.Smart.Inventory.Prediction.System.model.Category;
import com.Smart.Inventory.Prediction.System.repository.CategoryRepository;
import com.Smart.Inventory.Prediction.System.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void create(CategoryRequest categoryRequest) {

        Category category=new Category();

        category.setName(categoryRequest.getName());
        category.setDescription(categoryRequest.getDescription());

        categoryRepository.save(category);
    }
}

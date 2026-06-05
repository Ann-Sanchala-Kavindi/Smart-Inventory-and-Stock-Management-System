package com.Smart.Inventory.Prediction.System.service;

import com.Smart.Inventory.Prediction.System.controller.request.CategoryRequest;
import com.Smart.Inventory.Prediction.System.controller.response.CategoryResponse;

public interface CategoryService {
    void create(CategoryRequest categoryRequest);

    CategoryResponse getById(Long categoryId);
}

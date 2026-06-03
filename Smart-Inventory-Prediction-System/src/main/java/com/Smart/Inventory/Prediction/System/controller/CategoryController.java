package com.Smart.Inventory.Prediction.System.controller;

import com.Smart.Inventory.Prediction.System.controller.request.CategoryRequest;
import com.Smart.Inventory.Prediction.System.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public void create(@RequestBody CategoryRequest categoryRequest){

        categoryService.create(categoryRequest);
    }


}

package com.Smart.Inventory.Prediction.System.controller;

import com.Smart.Inventory.Prediction.System.controller.request.CategoryRequest;
import com.Smart.Inventory.Prediction.System.controller.response.CategoryResponse;
import com.Smart.Inventory.Prediction.System.model.Category;
import com.Smart.Inventory.Prediction.System.service.CategoryService;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RolesAllowed({"ADMIN", "MANAGER"})
    @PostMapping
    public void create(@RequestBody CategoryRequest categoryRequest){

        categoryService.create(categoryRequest);
    }

    @RolesAllowed({"ADMIN", "MANAGER"})
    @GetMapping(value="/{id}")
    public CategoryResponse getById(@PathVariable ("id") Long categoryId){

        return categoryService.getById(categoryId);



    }


}

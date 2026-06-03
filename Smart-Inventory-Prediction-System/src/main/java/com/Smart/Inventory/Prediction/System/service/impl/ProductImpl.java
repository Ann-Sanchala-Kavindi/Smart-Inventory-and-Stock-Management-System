package com.Smart.Inventory.Prediction.System.service.impl;

import com.Smart.Inventory.Prediction.System.controller.request.ProductRequest;
import com.Smart.Inventory.Prediction.System.exception.NotFoundException;
import com.Smart.Inventory.Prediction.System.model.Category;
import com.Smart.Inventory.Prediction.System.model.Product;
import com.Smart.Inventory.Prediction.System.repository.CategoryRepository;
import com.Smart.Inventory.Prediction.System.repository.ProductRepository;
import com.Smart.Inventory.Prediction.System.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class ProductImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void create(Long id,ProductRequest productRequest) {

        Category category=categoryRepository.findById(id).orElseThrow(
                ()-> new NotFoundException("Given Category Not Exist")
        );

        Product product=new Product();

        product.setCategories(category);

        product.setId(productRequest.getId());
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setCreatedDate(LocalDateTime.now());
        product.setUpdatedDate(LocalDateTime.now());
        product.setRecorderLevel(productRequest.getRecorderLevel());

        productRepository.save(product);

    }
}

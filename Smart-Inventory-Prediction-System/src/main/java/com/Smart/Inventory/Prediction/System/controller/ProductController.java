package com.Smart.Inventory.Prediction.System.controller;


import com.Smart.Inventory.Prediction.System.controller.request.ProductRequest;
import com.Smart.Inventory.Prediction.System.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value="/categories/{category-id}")
    public void create(@PathVariable ("category-id")Long id,
            @RequestBody ProductRequest productRequest){

        productService.create(id,productRequest);





    }
}

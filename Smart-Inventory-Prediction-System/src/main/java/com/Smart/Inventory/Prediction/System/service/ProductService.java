package com.Smart.Inventory.Prediction.System.service;

import com.Smart.Inventory.Prediction.System.controller.request.ProductRequest;

public interface ProductService {
    void create(Long id,ProductRequest productRequest);
}

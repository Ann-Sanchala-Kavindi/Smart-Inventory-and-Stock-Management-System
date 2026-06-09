package com.Smart.Inventory.Prediction.System.service.impl;

import com.Smart.Inventory.Prediction.System.controller.request.SaleRequest;
import com.Smart.Inventory.Prediction.System.controller.response.SaleResponse;
import com.Smart.Inventory.Prediction.System.service.SaleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleImpl implements SaleService {
    @Override
    public SaleResponse createSale(SaleRequest request) {
        return null;
    }

    @Override
    public SaleResponse getSaleById(Long saleId) {
        return null;
    }

    @Override
    public List<SaleResponse> getAllSales() {
        return List.of();
    }

    @Override
    public void deleteSale(Long saleId) {

    }
}

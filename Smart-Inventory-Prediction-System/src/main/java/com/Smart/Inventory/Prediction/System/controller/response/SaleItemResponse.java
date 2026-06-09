package com.Smart.Inventory.Prediction.System.controller.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SaleItemResponse {

    private Long productId;

    private String productName;

    private Long quantity;

    private Double unitPrice;

    private Double subTotal;





}

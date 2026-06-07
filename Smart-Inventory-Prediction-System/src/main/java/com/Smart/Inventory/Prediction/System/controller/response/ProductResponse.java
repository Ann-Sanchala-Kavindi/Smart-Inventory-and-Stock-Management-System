package com.Smart.Inventory.Prediction.System.controller.response;

import lombok.Data;

@Data
public class ProductResponse {

    private String name;
    private Double price;
    private Double reOrderLevel;

}

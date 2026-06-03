package com.Smart.Inventory.Prediction.System.controller.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductRequest {


    private Long id;

    private String name;
    private Double price;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String recorderLevel;
}

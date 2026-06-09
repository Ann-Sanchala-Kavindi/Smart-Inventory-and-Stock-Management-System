package com.Smart.Inventory.Prediction.System.controller.response;

import com.Smart.Inventory.Prediction.System.model.Enum.PaymentMethod;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class SaleResponse {

    private Long saleId;

    private LocalDateTime saleDate;

    private Double totalAmount;

    private PaymentMethod paymentMethod;

    private String managerName;

    private List<SaleItemResponse> items;
}

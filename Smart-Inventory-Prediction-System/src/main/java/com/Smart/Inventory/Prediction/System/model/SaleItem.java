package com.Smart.Inventory.Prediction.System.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="saleItems")
public class SaleItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long quantity;
    private Double unitPrice;
    private Double subTotal;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Sale sale;
}

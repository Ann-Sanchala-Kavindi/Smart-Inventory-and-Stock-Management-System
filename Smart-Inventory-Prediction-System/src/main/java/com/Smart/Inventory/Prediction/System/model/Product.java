package com.Smart.Inventory.Prediction.System.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String recorderLevel;

    @ManyToOne
    private Category categories;

    @ManyToMany
    @JoinTable(
            name = "product_supplier",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "supplier_id")
    )
    private List<Supplier> suppliers;

    @OneToMany(mappedBy = "product")
    private List<SaleItem> saleItems;

    @OneToMany(mappedBy = "product")
    private List<Prediction> predictions;





}

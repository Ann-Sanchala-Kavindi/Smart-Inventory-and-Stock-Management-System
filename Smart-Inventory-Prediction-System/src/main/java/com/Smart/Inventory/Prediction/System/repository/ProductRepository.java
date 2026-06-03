package com.Smart.Inventory.Prediction.System.repository;

import com.Smart.Inventory.Prediction.System.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

package com.springtester.tester.repository;

import com.springtester.tester.model.ProductStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStockRepository extends JpaRepository <ProductStock, Integer > {
}

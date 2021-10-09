package com.springtester.tester.repository;

import com.springtester.tester.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductInfo,Integer> {
}

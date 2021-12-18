package com.springtester.tester.repository;

import com.springtester.tester.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductInfo,Integer> {
    List<ProductInfo> findAllById(int id);
}

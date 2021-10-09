package com.springtester.tester.repository;

import com.springtester.tester.model.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository <ProductDetail,Integer> {
}

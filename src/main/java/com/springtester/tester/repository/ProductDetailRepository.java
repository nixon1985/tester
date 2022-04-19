package com.springtester.tester.repository;

import com.springtester.tester.model.ProductDetail;
import com.springtester.tester.service.ProductPriceInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDetailRepository extends JpaRepository <ProductDetail,Integer> {

    @Query(nativeQuery = true, value = "SELECT i.product_name productName, d.product_model productModel, d.product_price productPrice from product_detail d, product_info i where i.id=d.product_id")
    List<ProductPriceInterface> getProductPrice();
}

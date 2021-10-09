package com.springtester.tester.service;

import com.springtester.tester.model.ProductDetail;
import com.springtester.tester.repository.ProductDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailService {

    @Autowired
    private ProductDetailRepository productDetailRepository;

    public ProductDetail getProductDetail(ProductDetail productDetail){
        return productDetailRepository.save(productDetail);
    }

    public List<ProductDetail> getAllProductDetail(){
        return productDetailRepository.findAll();
    }

}

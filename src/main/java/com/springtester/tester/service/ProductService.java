package com.springtester.tester.service;

import com.springtester.tester.model.ProductInfo;
import com.springtester.tester.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductInfo saveProduct(ProductInfo productInfo){
        return productRepository.save(productInfo);
    }

    public List<ProductInfo> saveProducts(List<ProductInfo> productInfo){
        return productRepository.saveAll(productInfo);
    }

    public List<ProductInfo> getAllProduct(){
        return productRepository.findAll();
    }
}

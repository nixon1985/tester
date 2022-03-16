package com.springtester.tester.controller;

import com.springtester.tester.model.ProductInfo;
import com.springtester.tester.model.ProductStock;
import com.springtester.tester.repository.ProductRepository;
import com.springtester.tester.repository.ProductStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllinAll {

    @Autowired
    private ProductStockRepository productStockRepository;

    @GetMapping("/getAllProduct")
    public List<ProductInfo> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/getAllProductStock")
    public List<ProductStock> getAllProductStock(){
        return productStockRepository.findAll();
    }
}

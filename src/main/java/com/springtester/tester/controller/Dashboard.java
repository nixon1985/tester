package com.springtester.tester.controller;


import com.springtester.tester.dto.Product;
import com.springtester.tester.model.ProductInfo;
import com.springtester.tester.repository.ProductDetailRepository;
import com.springtester.tester.repository.ProductRepository;
import com.springtester.tester.service.ProductDetailService;
import com.springtester.tester.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Dashboard {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductDetailRepository productDetailRepository;

    @Autowired
    private ProductService productService;
    private ProductDetailService productDetailService;

    @GetMapping("/")
    public String testpage(){
        return "hello world";
    }

    @PostMapping("/saveProduct")
    public ProductInfo saveProduct(@RequestBody ProductInfo productInfo){
       return productService.saveProduct(productInfo);
    }

    @PostMapping("/saveProducts")
    public List<ProductInfo> saveProducts(@RequestBody List<ProductInfo> productInfo){
        return productService.saveProducts(productInfo);
    }

    @GetMapping("/getAllProduct")
    public List<ProductInfo> getAllProduct(){
        return productService.getAllProduct();
    }


    @PostMapping("/addProduct")
    public ProductInfo productInfo(@RequestBody Product product){
        return productRepository.save(product.getProductInfo());
    }
/*
    @GetMapping("/findAllProduct")
    public List<ProductInfo> findAllProduct(){
        return productRepository.findAll();
    }
*/
}

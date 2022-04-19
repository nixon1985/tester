package com.springtester.tester.controller;


import com.springtester.tester.dto.Product;
import com.springtester.tester.model.ProductInfo;
import com.springtester.tester.repository.ProductDetailRepository;
import com.springtester.tester.repository.ProductRepository;
import com.springtester.tester.service.ProductDetailService;
import com.springtester.tester.service.ProductPriceInterface;
import com.springtester.tester.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@RestController
public class Dashboard {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductDetailRepository productDetailRepository;

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductDetailService productDetailService;


    @GetMapping("/")
    ModelAndView getHome(){
        //Calculating today
        SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd-MMM-yyyy, E \nhh:mm:ss aa ");
        dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
        String today = dateTimeInGMT.format(new Date());

        //Creating model
        ModelAndView mv = new ModelAndView();
        mv.addObject("today", today);
        mv.setViewName("index.html");

        return mv;
    }


    @GetMapping("/hello")
    public String testpage(){
        return "hello world";
    }

    /* ------------- Multi type Insertion process (Part) -----------*/

    @PostMapping("/saveProduct")
    public ProductInfo saveProduct(@RequestBody ProductInfo productInfo){
       return productService.saveProduct(productInfo);
    }

    @PostMapping("/saveProducts")
    public List<ProductInfo> saveProducts(@RequestBody List<ProductInfo> productInfo){
        return productService.saveProducts(productInfo);
    }

    /* ----------- */
    @PostMapping("/addProduct")
    public ProductInfo productInfo(@RequestBody Product product){
        return productRepository.save(product.getProductInfo());
    }

    @PostMapping("/addAllProduct")
    public List<ProductInfo> productInfos(@RequestBody Product product){
        return productRepository.saveAll(product.getProductInfos());
    }

    /* ------ End Insertion Part ------ */


    /* ---------- Get data from database ----------*/
    @GetMapping("/getAllProduct")
    public List<ProductInfo> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/findAllProduct")
    public List<ProductInfo> findAllProduct(){
        return productRepository.findAll();
    }

    @RequestMapping(value = "/findByID/{id}")
    public List<ProductInfo> findByID(@PathVariable int id) {
        return productRepository.findAllById(id);
    }

    @GetMapping("/getAllByID/{id}")
    public List<ProductInfo> getAllByID(@PathVariable int id) {
        return productRepository.findAllById(id);
    }



    // Call Service
    @GetMapping("/getAllProductPrice")
    public List<ProductPriceInterface> getAllProductPrice(){
        return productDetailService.getProductPrice();
    }

    //    Direct call Repository
    @GetMapping("/getProductPrice")
    public List<ProductPriceInterface> getAllProductPrice1(){
        return productDetailRepository.getProductPrice();
    }

/*
    @GetMapping("/getByID/{id}")
    public ProductInfo getByID(@PathVariable int id) {
        return productRepository.getById(id);
    }
*/


}

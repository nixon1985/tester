package com.springtester.tester.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_detail")
//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "productId")
public class ProductDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer productId;
    private String productModel;
    private String productPrice;

//    @OneToOne(targetEntity = ProductInfo.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "id",referencedColumnName = "productId")
//    private List<ProductInfo> productInfo;

    @OneToMany(targetEntity = ProductStock.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "productDetailId",referencedColumnName = "id")
    private List<ProductStock> productStocks;
}

package com.springtester.tester.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_detail")
public class ProductDetail {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "productId")
    private Integer productId;
    private String productModel;

}

package com.springtester.tester.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "product_info")

public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;
    private String productPrice;

    // @OneToMany(mappedBy = "productId",fetch = FetchType.LAZY)
    // List<ProductDetail> productDetail;

    @OneToMany(targetEntity = ProductDetail.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "productId",referencedColumnName = "id")
    private List<ProductDetail> productDetail;

}

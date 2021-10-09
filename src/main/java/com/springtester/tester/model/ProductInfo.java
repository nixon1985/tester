package com.springtester.tester.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_info")

public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;
    private Number productPrice;

    @OneToMany(mappedBy = "productId",fetch = FetchType.LAZY)
    private List<ProductDetail> productDetail;

}

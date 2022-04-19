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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name = "product_stock")
public class ProductStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer productDetailId;
    private String stock;
    private String batchNo;

//    @OneToMany(targetEntity = ProductDetail.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "productId",referencedColumnName = "id")
//    private List<ProductDetail> productDetail1;

    //@ManyToOne(targetEntity = ProductDetail.class,cascade = CascadeType.DETACH)
    @OneToOne
    @JoinColumn(name="productDetailId",insertable = false, updatable = false)
    private ProductDetail productDetail;

    //public ProductStock() {}
}

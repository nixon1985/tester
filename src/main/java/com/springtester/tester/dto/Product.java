package com.springtester.tester.dto;


import com.springtester.tester.model.ProductInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private ProductInfo productInfo;
    private List<ProductInfo> productInfos;
}

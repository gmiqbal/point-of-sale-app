package com.gmiqbal.pos.service;

import com.gmiqbal.pos.dtos.responses.ProductResponseData;
import com.gmiqbal.pos.entities.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public ProductResponseData buildproductResponseData(Product product){
        ProductResponseData productResponseData = ProductResponseData.builder()
                .id(product.getId())
                .name(product.getName())
                .code(product.getCode())
                .price(product.getPrice())
                .category(product.getCategory())
                .brand(product.getBrand())
                .details(product.getDetails())
                .build();
        return productResponseData;
    }
}

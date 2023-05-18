package com.gmiqbal.pos.controllers;

import com.gmiqbal.pos.dtos.requests.ProductRequestData;
import com.gmiqbal.pos.dtos.responses.ProductResponseData;
import com.gmiqbal.pos.entities.Product;
import com.gmiqbal.pos.repos.ProductRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.*;

@RestController
@RequestMapping("/products")
@Data
public class PosController{
    @Autowired
    ProductRepo productRepo;
    @PostMapping("")
    public ProductResponseData addProduct (@RequestBody @Valid ProductRequestData productRequestData){
        Product product = new Product();
        product.setName(productRequestData.getName());
        product.setCode(productRequestData.getCode());
        product.setPrice(productRequestData.getPrice());
        product.setCategory(productRequestData.getCategory());
        product.setBrand(productRequestData.getBrand());
        product.setDetails(productRequestData.getDetails());

        System.out.println(product.getBrand());

        Product savedProduct = productRepo.save(product);

        ProductResponseData productResponseData = new ProductResponseData();
        productResponseData.setId(savedProduct.getId());
        productResponseData.setName(savedProduct.getName());
        productResponseData.setCode(savedProduct.getCode());
        productResponseData.setPrice(savedProduct.getPrice());
        productResponseData.setCategory(savedProduct.getCategory());
        productResponseData.setBrand(savedProduct.getBrand());
        productResponseData.setDetails(savedProduct.getDetails());
        productResponseData.set_deleted(savedProduct.isDeleted());
        productResponseData.setCreated_at(savedProduct.getCreatedAt());
        productResponseData.setModified_at(savedProduct.getModifiedAt());

        System.out.println(productResponseData.getBrand());

        return productResponseData;
    }

}

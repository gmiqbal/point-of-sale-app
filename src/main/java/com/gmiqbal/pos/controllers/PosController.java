package com.gmiqbal.pos.controllers;

import com.gmiqbal.pos.dtos.requests.ProductEditRequestData;
import com.gmiqbal.pos.dtos.requests.ProductRequestData;
import com.gmiqbal.pos.dtos.responses.MasterCategoryResponse;
import com.gmiqbal.pos.dtos.responses.ProductResponseData;
import com.gmiqbal.pos.entities.MasterCategory;
import com.gmiqbal.pos.entities.Product;
import com.gmiqbal.pos.repos.MasterCategoryRepo;
import com.gmiqbal.pos.repos.ProductRepo;
import com.gmiqbal.pos.service.ProductService;
import jakarta.persistence.EntityNotFoundException;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;
import java.util.*;

@RestController
@RequestMapping("/product")
@Data
public class PosController{
    @Autowired
    ProductRepo productRepo;
    @Autowired
    ProductService productService;
    @Autowired
    MasterCategoryRepo masterCategoryRepo;

    @PostMapping("")
    public ProductResponseData addProduct (@RequestBody @Valid ProductRequestData productRequestData){
        Product product = new Product();
        product.setName(productRequestData.getName());
        product.setCode(productRequestData.getCode());
        product.setPrice(productRequestData.getPrice());
        product.setBarcode(productRequestData.getBarcode());
        product.setDetails(productRequestData.getDetails());

        MasterCategory masterCategory = masterCategoryRepo.findById(
                productRequestData.getMasterCategoryId()).orElseThrow(() -> new EntityNotFoundException("Please enter valid master category id"));

        product.setMasterCategory(masterCategory);
        Product savedProduct = productRepo.save(product);

//        ProductResponseData productResponseData = ProductResponseData.builder()
//            .id(savedProduct.getId())
//            .name(savedProduct.getName())
//            .code(savedProduct.getCode())
//            .price(savedProduct.getPrice())
//            .category(savedProduct.getCategory())
//            .brand(savedProduct.getBrand())
//            .details(savedProduct.getDetails())
////            .isDeleted(savedProduct.isDeleted())
////            .createdAt(savedProduct.getCreatedAt())
////            .modifiedAt(savedProduct.getModifiedAt())
//              .build();

        ProductResponseData productResponseData = productService.buildProductResponseData(savedProduct);
        return productResponseData;
    }

    @GetMapping("/view")
    public List<ProductResponseData> viewProduct(){
        List<Product> productList = productRepo.findAll();
        List<ProductResponseData> productResponseDataList = new ArrayList<>();
        for (Product savedProduct: productList) {
            ProductResponseData productResponseData = productService.buildProductResponseData(savedProduct);
            productResponseDataList.add(productResponseData);
        }
        return productResponseDataList;
    }

    @GetMapping("/view/{id}")
    public ProductResponseData viewSingleProduct(@PathVariable("id") int id){
        Product savedProduct = productRepo.findById(id).orElse(null);
        if(savedProduct == null){
            ProductResponseData productResponseData = ProductResponseData.builder().build();
            return productResponseData;
        }else{
            ProductResponseData productResponseData = productService.buildProductResponseData(savedProduct);

            MasterCategory masterCategory = savedProduct.getMasterCategory();

            MasterCategoryResponse masterCategoryResponse = MasterCategoryResponse.builder()
                    .id(masterCategory.getId())
                    .name(masterCategory.getCategoryName())
                    .build();
            productResponseData.setMasterCategoryResponse(masterCategoryResponse);

            return productResponseData;
        }
    }

    @DeleteMapping("/view/{id}")
    public String deleteProduct(@PathVariable("id") int id){
        Product savedProduct =productRepo.findById(id).orElse(null);
        if(savedProduct == null){
            return "No product found in db with id " + id + ".";
        }else{
            productRepo.delete(savedProduct);
            return  "The product with id " + id + " is deleted successfully";
        }
    }

    @PutMapping("/update")
    public ProductResponseData updateProduct(@RequestBody ProductEditRequestData productEditRequestData){
        Product savedProduct = productRepo.findById(productEditRequestData.getId()).orElse(null);
        if(savedProduct==null){
            ProductResponseData productResponseData = ProductResponseData.builder().build();
            return productResponseData;
        }else{
            if(productEditRequestData.getName() != null){
                savedProduct.setName(productEditRequestData.getName());
            }
            if(productEditRequestData.getCode() != null){
                savedProduct.setCode(productEditRequestData.getCode());
            }
            if(productEditRequestData.getPrice() != null){
                savedProduct.setPrice(productEditRequestData.getPrice());
            }
//            if(productEditRequestData.getCategory() != null){
//                savedProduct.setCategory(savedProduct.getCategory());
//            }
            if (productEditRequestData.getBarcode() != null){
                savedProduct.setBarcode(savedProduct.getBarcode());
            }
            if(productEditRequestData.getDetails() != null){
                savedProduct.setDetails(savedProduct.getDetails());
            }

            Product updatedProduct = productRepo.save(savedProduct);

            ProductResponseData productResponseData = productService.buildProductResponseData(updatedProduct);

//            ProductResponseData productResponseData = ProductResponseData.builder()
//                    .id(updatedProduct.getId())
//                    .name(updatedProduct.getName())
//                    .code(updatedProduct.getCode())
//                    .price(updatedProduct.getPrice())
//                    .category(updatedProduct.getCategory())
//                    .brand(updatedProduct.getBrand())
//                    .details(updatedProduct.getDetails())
//                    .build();
            return productResponseData;
        }
    }
}
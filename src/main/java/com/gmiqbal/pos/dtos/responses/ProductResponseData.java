package com.gmiqbal.pos.dtos.responses;

import com.gmiqbal.pos.constants.BrandNames;
import com.gmiqbal.pos.constants.CategoryType;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class ProductResponseData {
    private int id;
    private String name;
    private String code;
    private Integer price;
    private CategoryType category;
    private BrandNames brand;
    private String details;
    private MasterCategoryResponse masterCategoryResponse;
//    private boolean isDeleted;
//    private Date createdAt;
//    private Date modifiedAt;
}

package com.gmiqbal.pos.dtos.requests;

import com.gmiqbal.pos.constants.BrandNames;
import com.gmiqbal.pos.constants.CategoryType;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ProductEditRequestData {
    @NotNull
    private int id;
    private String name;
    private String code;
    private Integer price;
    private CategoryType category;
    private BrandNames brand;
    private String details;

}

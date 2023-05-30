package com.gmiqbal.pos.dtos.requests;

import com.gmiqbal.pos.constants.BrandNames;
import com.gmiqbal.pos.constants.CategoryType;
import javax.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequestData {
    @NotNull
    private String name;
    @NotNull
    private String code;
    @NotNull
    private BigDecimal price;
//    @NotNull
//    private CategoryType category;
    @NotNull
    private BrandNames brand;
    @NotNull
    private String details;
    @NotNull
    private Integer masterCategoryId;

}

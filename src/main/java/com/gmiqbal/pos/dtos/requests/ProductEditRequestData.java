package com.gmiqbal.pos.dtos.requests;

import com.gmiqbal.pos.constants.BrandNames;
import com.gmiqbal.pos.constants.CategoryType;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class ProductEditRequestData {
    @NotNull
    private int id;
    private String name;
    private String code;
    private BigDecimal price;
//    private CategoryType category;
    private BrandNames brand;
    private String details;

}

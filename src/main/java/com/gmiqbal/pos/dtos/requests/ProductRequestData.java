package com.gmiqbal.pos.dtos.requests;

import com.gmiqbal.pos.constants.BrandNames;
import com.gmiqbal.pos.constants.CategoryType;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductRequestData {
//    @NotNull
    private String name;
    private int code;
    private int price;
    private CategoryType category;
    private BrandNames brand;
    private String details;

}

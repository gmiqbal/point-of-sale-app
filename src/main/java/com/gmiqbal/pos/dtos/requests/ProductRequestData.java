package com.gmiqbal.pos.dtos.requests;

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
    @NotNull
    private String barcode;
    @NotNull
    private String details;
    @NotNull
    private Integer masterCategoryId;

}

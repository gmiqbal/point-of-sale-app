package com.gmiqbal.pos.dtos.requests;

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
    private String barcode;
    private String details;

}

package com.gmiqbal.pos.dtos.responses;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductResponseData {
    private int id;
    private String name;
    private String code;
    private BigDecimal price;
    private String barcode;
    private String details;

    private MasterCategoryResponse masterCategoryResponse;
}

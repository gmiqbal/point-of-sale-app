package com.gmiqbal.pos.dtos.responses;

import com.gmiqbal.pos.constants.BrandNames;
import com.gmiqbal.pos.constants.CategoryType;
import lombok.Data;

import java.util.Date;
@Data
public class ProductResponseData {
    private int id;
    private String name;
    private int code;
    private int price;
    private CategoryType category;
    private BrandNames brand;
    private String details;
    private boolean is_deleted;
    private Date created_at;
    private Date modified_at;
}

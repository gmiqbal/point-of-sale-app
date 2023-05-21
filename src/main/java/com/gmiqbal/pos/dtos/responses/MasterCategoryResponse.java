package com.gmiqbal.pos.dtos.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MasterCategoryResponse {
    private Integer id;
    private String name;
}

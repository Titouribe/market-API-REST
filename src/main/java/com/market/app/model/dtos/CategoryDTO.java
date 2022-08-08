package com.market.app.model.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class CategoryDTO {

    private UUID idCategory;
    private String description;
    private Boolean categoryStatus;
    private List<ProductDTO> productDTOList;

}

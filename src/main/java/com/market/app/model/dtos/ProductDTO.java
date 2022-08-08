package com.market.app.model.dtos;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class ProductDTO {

    private UUID idProduct;
    private String productName;
    private CategoryDTO categoryDTO;
    private BigDecimal price;
    private Integer productStock;
    private Boolean productStatus;

}

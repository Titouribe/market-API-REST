package com.market.app.model.dtos;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class PucharsesProductDTO {

    private UUID idPucharseProduct;
    private PucharseDTO pucharseDTO;
    private ProductDTO productDTO;
    private Integer amount;
    private BigDecimal total;
    private Boolean status;

}

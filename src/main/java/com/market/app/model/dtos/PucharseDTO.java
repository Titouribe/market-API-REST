package com.market.app.model.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class PucharseDTO {

    private UUID idPucharse;
    private ClientDTO clientDTO;
    private LocalDateTime pucharseDate;
    private String paymentMethod;
    private String paymentComment;
    private Boolean pucharseStatus;
    private List<PucharsesProductDTO> pucharsesProductDTOS;

}

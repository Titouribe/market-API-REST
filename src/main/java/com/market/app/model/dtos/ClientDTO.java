package com.market.app.model.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class ClientDTO {

    private UUID idClient;
    private String clientName;
    private String clientLastName;
    private Long clientCellPhone;
    private String clientEmail;
    private List<PucharseDTO> pucharseDTOList;

}

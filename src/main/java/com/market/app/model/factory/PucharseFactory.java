package com.market.app.model.factory;

import com.market.app.model.dtos.PucharseDTO;
import com.market.app.model.entities.Pucharse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class PucharseFactory {

    private final ClientFactory clientFactory;

    private final PucharsesProductFactory pucharsesProductFactory;

    public Pucharse create(PucharseDTO pucharseDTO) {

        return pucharseDTO != null ?
                Pucharse.builder()
                        .idPucharse(pucharseDTO.getIdPucharse())
                        .client(clientFactory.create(pucharseDTO.getClientDTO()))
                        .pucharseDate(LocalDateTime.now())
                        .paymentComment(pucharseDTO.getPaymentComment())
                        .paymentMethod(pucharseDTO.getPaymentMethod())
                        .pucharseStatus(pucharseDTO.getPucharseStatus())
                        .products(pucharseDTO.getPucharsesProductDTOS()
                                .stream()
                                .map(pucharsesProductFactory::create).toList())
                        .build() : null;

    }

    public PucharseDTO create(Pucharse pucharse) {

        return pucharse != null ?
                PucharseDTO.builder()
                        .idPucharse(pucharse.getIdPucharse())
                        .clientDTO(clientFactory.create(pucharse.getClient()))
                        .pucharseDate(pucharse.getPucharseDate())
                        .paymentComment(pucharse.getPaymentComment())
                        .paymentMethod(pucharse.getPaymentMethod())
                        .pucharseStatus(pucharse.getPucharseStatus())
                        .pucharsesProductDTOS(pucharse.getProducts()
                                .stream()
                                .map(pucharsesProductFactory::create).toList())
                        .build() : null;

    }
}

package com.market.app.model.factory;

import com.market.app.model.dtos.PucharsesProductDTO;
import com.market.app.model.entities.PucharsesProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class PucharsesProductFactory {

    public PucharsesProduct create(PucharsesProductDTO pucharsesProductDTO){

        return pucharsesProductDTO != null ?
                PucharsesProduct.builder()
                        .idPucharsesproduct(pucharsesProductDTO.getIdPucharseProduct())
                        .amount(pucharsesProductDTO.getAmount())
                        .total(pucharsesProductDTO.getTotal())
                        .status(pucharsesProductDTO.getStatus())
                        .build() : null;

    }

    public PucharsesProductDTO create(PucharsesProduct pucharsesProduct){

        return pucharsesProduct != null ?
                PucharsesProductDTO.builder()
                        .idPucharseProduct(pucharsesProduct.getIdPucharsesproduct())
                        .amount(pucharsesProduct.getAmount())
                        .total(pucharsesProduct.getTotal())
                        .status(pucharsesProduct.getStatus())
                        .build() : null;

    }
}

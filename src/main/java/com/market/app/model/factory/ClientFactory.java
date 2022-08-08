package com.market.app.model.factory;

import com.market.app.model.dtos.ClientDTO;
import com.market.app.model.entities.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClientFactory {

    private final PucharseFactory pucharseFactory;

    public Client create(ClientDTO clientDTO){

        return clientDTO != null ?
                Client.builder()
                        .idClient(clientDTO.getIdClient())
                        .clientName(clientDTO.getClientName())
                        .clientLastName(clientDTO.getClientLastName())
                        .clientEmail(clientDTO.getClientEmail())
                        .clientCellphone(clientDTO.getClientCellPhone())
                        .pucharses(clientDTO.getPucharseDTOList()
                                .stream()
                                .map(pucharseFactory::create).toList())
                        .build() : null;

    }

    public ClientDTO create(Client client){

        return client != null ?
                ClientDTO.builder()
                        .idClient(client.getIdClient())
                        .clientName(client.getClientName())
                        .clientLastName(client.getClientLastName())
                        .clientEmail(client.getClientEmail())
                        .clientCellPhone(client.getClientCellphone())
                        .pucharseDTOList(client.getPucharses()
                                .stream()
                                .map(pucharseFactory::create).toList())
                        .build() : null;

    }
}

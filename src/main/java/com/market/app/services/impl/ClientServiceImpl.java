package com.market.app.services.impl;

import com.market.app.model.factory.ClientFactory;
import com.market.app.repository.IClientRepository;
import com.market.app.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;

public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientRepository clientRepository;

    @Autowired
    private ClientFactory clientFactory;
}

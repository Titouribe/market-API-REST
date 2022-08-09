package com.market.app.services.impl;

import com.market.app.model.factory.PucharsesProductFactory;
import com.market.app.repository.IPucharsesProductRepository;
import com.market.app.services.IPucharsesProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class PucharsesProductServiceImpl implements IPucharsesProductService {

    @Autowired
    private IPucharsesProductRepository productRepository;

    @Autowired
    private PucharsesProductFactory pucharsesProductFactory;

    
}

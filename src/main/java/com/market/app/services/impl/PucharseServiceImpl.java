package com.market.app.services.impl;

import com.market.app.model.factory.PucharseFactory;
import com.market.app.repository.IPucharseRepository;
import com.market.app.services.IPucharseService;
import org.springframework.beans.factory.annotation.Autowired;

public class PucharseServiceImpl implements IPucharseService {

    @Autowired
    private IPucharseRepository pucharseRepository;

    @Autowired
    private PucharseFactory pucharseFactory;
}

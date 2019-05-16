package com.napalm23zero.gamestore.services.impl;

import com.napalm23zero.gamestore.models.Accessory;
import com.napalm23zero.gamestore.repositories.GenericRepository;
import com.napalm23zero.gamestore.services.AccessoryService;

import org.springframework.stereotype.Service;

@Service("accessoryService")
public class AccessoryServiceImpl extends GenericServiceImpl<Accessory, Long> implements AccessoryService {

    public AccessoryServiceImpl(GenericRepository<Accessory, Long> genericRepository) {
        super(genericRepository);
    }

}
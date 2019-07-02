package com.napalm23zero.gamestore.services.impl;

import com.napalm23zero.gamestore.models.Accessory;
import com.napalm23zero.gamestore.repositories.GenericRepository;
import com.napalm23zero.gamestore.services.AccessoryService;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service("accessoryService")
public class AccessoryServiceImpl extends GenericServiceImpl<Accessory, ObjectId> implements AccessoryService {
    public AccessoryServiceImpl(GenericRepository<Accessory, ObjectId> genericRepository) {
        super(genericRepository);
    }
}
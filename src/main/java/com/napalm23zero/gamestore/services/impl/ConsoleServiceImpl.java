package com.napalm23zero.gamestore.services.impl;

import com.napalm23zero.gamestore.models.Console;
import com.napalm23zero.gamestore.repositories.GenericRepository;
import com.napalm23zero.gamestore.services.ConsoleService;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service("consoleService")
public class ConsoleServiceImpl extends GenericServiceImpl<Console, ObjectId> implements ConsoleService {

    public ConsoleServiceImpl(GenericRepository<Console, ObjectId> genericRepository) {
        super(genericRepository);
    }

}
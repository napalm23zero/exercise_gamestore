package com.napalm23zero.gamestore.services.impl;

import com.napalm23zero.gamestore.models.Console;
import com.napalm23zero.gamestore.repositories.ConsoleRepository;
import com.napalm23zero.gamestore.repositories.GenericRepository;
import com.napalm23zero.gamestore.services.ConsoleService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("consoleService")
public class ConsoleServiceImpl extends GenericServiceImpl<Console, ObjectId> implements ConsoleService {
    @Autowired
    private ConsoleRepository repository;

    public ConsoleServiceImpl(GenericRepository<Console, ObjectId> genericRepository) {
        super(genericRepository);
    }

}
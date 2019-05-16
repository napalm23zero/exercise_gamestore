package com.napalm23zero.gamestore.services.impl;

import com.napalm23zero.gamestore.models.Console;
import com.napalm23zero.gamestore.repositories.GenericRepository;
import com.napalm23zero.gamestore.services.ConsoleService;

import org.springframework.stereotype.Service;

@Service("accessoryService")
public class ConsoleServiceImpl extends GenericServiceImpl<Console, Long> implements ConsoleService {

    public ConsoleServiceImpl(GenericRepository<Console, Long> genericRepository) {
        super(genericRepository);
    }

}
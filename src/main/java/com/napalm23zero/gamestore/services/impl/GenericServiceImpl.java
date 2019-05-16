package com.napalm23zero.gamestore.services.impl;

import com.napalm23zero.gamestore.repositories.GenericRepository;
import com.napalm23zero.gamestore.services.GenericService;

public abstract class GenericServiceImpl<R, D> implements GenericService<R, D> {

    protected final GenericRepository<R, D> genericRepository;

    public GenericServiceImpl(GenericRepository<R, D> genericRepository) {
        this.genericRepository = genericRepository;
    }

}
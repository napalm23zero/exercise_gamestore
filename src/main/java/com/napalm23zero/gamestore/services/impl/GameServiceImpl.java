package com.napalm23zero.gamestore.services.impl;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.repositories.GenericRepository;
import com.napalm23zero.gamestore.services.GameService;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service("gameService")
public class GameServiceImpl extends GenericServiceImpl<Game, ObjectId> implements GameService {
    public GameServiceImpl(GenericRepository<Game, ObjectId> genericRepository) {
        super(genericRepository);
    }
}
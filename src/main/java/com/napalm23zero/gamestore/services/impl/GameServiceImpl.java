package com.napalm23zero.gamestore.services.impl;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.repositories.GameRepository;
import com.napalm23zero.gamestore.repositories.GenericRepository;
import com.napalm23zero.gamestore.services.GameService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gameService")
public class GameServiceImpl extends GenericServiceImpl<Game, ObjectId> implements GameService {
    @Autowired
    private GameRepository repository;

    public GameServiceImpl(GenericRepository<Game, ObjectId> genericRepository) {
        super(genericRepository);
    }

    @Override
    public void deleteById(ObjectId id) {
        repository.deleteById(id);
    }

}
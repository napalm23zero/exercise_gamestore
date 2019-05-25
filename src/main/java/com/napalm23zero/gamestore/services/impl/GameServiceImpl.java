package com.napalm23zero.gamestore.services.impl;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.repositories.GameRepository;
import com.napalm23zero.gamestore.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gameService")
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    public Game create(Game game) {
        return repository.save(game);
    }
}
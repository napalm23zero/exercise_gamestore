package com.napalm23zero.gamestore.services.impl;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.repositories.GameRepository;
import com.napalm23zero.gamestore.repositories.GenericRepository;
import com.napalm23zero.gamestore.services.GameService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("gameService")
public class GameServiceImpl extends GenericServiceImpl<Game, ObjectId> implements GameService {
    @Autowired
    private GameRepository repository;

    public GameServiceImpl(GenericRepository<Game, ObjectId> genericRepository) {
        super(genericRepository);
    }

    public Game create(Game game) {
        return repository.save(game);
    }


    public Optional<Game> read(ObjectId id) {
        return repository.findById(id);
    }

    public Game update(Game game) {
        return repository.save(game);
    }

    public void delete(ObjectId id) {
        repository.deleteById(id);
    }

    public Page<Game> list(Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy) {
        Pageable pagination = PageRequest.of(pageNumber, pageSize, direction, orderBy);
        return repository.findAll(pagination);
    }

    public Page<Game> search(Game game, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy) {
        Pageable pagination = PageRequest.of(pageNumber, pageSize, direction, orderBy);
        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreCase().withIgnoreNullValues().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING).withIgnorePaths("id");
        Example<Game> query = Example.of(game, matcher);
        return repository.findAll(query, pagination);
    }
    
    public Page<Game> find(Game game, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy) {
        Pageable pagination = PageRequest.of(pageNumber, pageSize, direction, orderBy);
        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreCase().withIgnoreNullValues().withStringMatcher(ExampleMatcher.StringMatcher.EXACT).withIgnorePaths("id");
        Example<Game> query = Example.of(game, matcher);
        return repository.findAll(query, pagination);
    }
}
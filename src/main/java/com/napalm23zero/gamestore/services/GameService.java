package com.napalm23zero.gamestore.services;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.repositories.GameRepository;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.Optional;

public interface GameService extends GenericService<Game, ObjectId>, GameRepository {


    Optional<Game> read(ObjectId id);

    Game update(Game game);

    void delete(Game id);

    Page<Game> list(Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<Game> search(Game game, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<Game> find(Game game, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);
}
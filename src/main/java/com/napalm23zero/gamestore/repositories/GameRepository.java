package com.napalm23zero.gamestore.repositories;

import com.napalm23zero.gamestore.models.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game, Long> {

}
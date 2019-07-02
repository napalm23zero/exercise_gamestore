package com.napalm23zero.gamestore.repositories;

import com.napalm23zero.gamestore.models.Game;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends GenericRepository<Game, ObjectId> {
}
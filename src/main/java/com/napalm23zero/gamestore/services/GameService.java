package com.napalm23zero.gamestore.services;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.repositories.GameRepository;

import org.bson.types.ObjectId;

public interface GameService extends GenericService<Game, ObjectId>, GameRepository {
}
package com.napalm23zero.gamestore.services;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.repositories.GameRepository;

public interface GameService extends GenericService<Game, Long>, GameRepository {

}
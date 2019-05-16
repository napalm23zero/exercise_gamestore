package com.napalm23zero.gamestore.repositories;

import com.napalm23zero.gamestore.models.Game;

import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {

}
package com.napalm23zero.gamestore.controllers;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.services.GameService;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags = "Game")
@RestController
@RequestMapping("/game")
public class GameController extends GenericController<Game, ObjectId> {

    GameController(GameService service) {
        super(service);
    }
}
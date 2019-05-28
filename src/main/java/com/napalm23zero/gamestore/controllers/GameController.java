package com.napalm23zero.gamestore.controllers;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.services.GenericService;
import io.swagger.annotations.Api;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Game")
@RestController
@RequestMapping("/game")
public class GameController extends GenericController<Game, ObjectId> {


    GameController(GenericService service) {
        super(service);
    }

}
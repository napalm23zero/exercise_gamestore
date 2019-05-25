package com.napalm23zero.gamestore.controllers;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.services.GameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Game")
@RestController
@RequestMapping("/game")
@Controller
public class GameController {

    private final GameService service;

    @Autowired
    public GameController(GameService service) {
        this.service = service;
    }

    @ApiOperation(value = "Insert a new Game")
    @RequestMapping(method = RequestMethod.POST)
    public Game create(@ApiParam(value = "Game", required = true) @RequestBody Game game) {
        return service.create(game);
    }
}
package com.napalm23zero.gamestore.controllers;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.services.GameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Api(tags = "Game")
@RestController
@RequestMapping("/game")
public class GameController {
    private final GameService service;

    @Autowired
    public GameController(GameService service) {
        this.service = service;
    }

    @ApiOperation(value = "Insert a new Game")
    @RequestMapping(method = RequestMethod.POST)
    public Game create(
            @ApiParam(value = "Game", required = true)
            @RequestBody Game game) {
        return service.create(game);
    }

    @ApiOperation(value = "Get a single Game")
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Optional<Game> read(
            @ApiParam(value = "id", required = true)
            @PathVariable ObjectId id) {
        return service.read(id);
    }

    @ApiOperation(value = "Update a existing Game")
    @RequestMapping(method = RequestMethod.PUT)
    public Game update(
            @ApiParam(value = "game", required = true)
            @RequestBody @Valid Game game) {
        return service.update(game);
    }

    @ApiOperation(value = "Delete a single Game")
    @RequestMapping(method = RequestMethod.DELETE, value = "/{ id}")
    public void delete(
            @ApiParam(value = "id", required = true)
            @PathVariable ObjectId id) {
        service.delete(id);
    }

    @ApiOperation(value = "Show a Pageable list of all Games")
    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public Page<Game> list(
            @RequestParam(value = "page number", defaultValue = "0", required = true) Integer pageNumber,
            @RequestParam(value = "page size", defaultValue = "10", required = true) Integer pageSize,
            @RequestParam(value = "direction", defaultValue = "ASC", required = true) Sort.Direction direction,
            @RequestParam(value = "orderBy", defaultValue = "id", required = true) String orderBy) {
        return service.list(pageNumber, pageSize, direction, orderBy);
    }

    @ApiOperation(value = "Show a pageable list of a Filter of Games (like)")
    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public Page<Game> search(
            @ApiParam(value = "game", required = true) Game game,
            @RequestParam(value = "page number", defaultValue = "0", required = true) Integer pageNumber,
            @RequestParam(value = "page size", defaultValue = "10", required = true) Integer pageSize,
            @RequestParam(value = "direction", defaultValue = "ASC", required = true) Sort.Direction direction,
            @RequestParam(value = "orderBy", defaultValue = "id", required = true) String orderBy) {
        return service.search(game, pageNumber, pageSize, direction, orderBy);
    }

    @ApiOperation(value = "Show a pageable list of a Filter of Games (exact)")
    @RequestMapping(method = RequestMethod.GET, value = "/find")
    public Page<Game> find(
            @ApiParam(value = "game", required = true) Game game,
            @RequestParam(value = "page number", defaultValue = "0", required = true) Integer pageNumber,
            @RequestParam(value = "page size", defaultValue = "10", required = true) Integer pageSize,
            @RequestParam(value = "direction", defaultValue = "ASC", required = true) Sort.Direction direction,
            @RequestParam(value = "orderBy", defaultValue = "id", required = true) String orderBy) {
        return service.find(game, pageNumber, pageSize, direction, orderBy);
    }
}
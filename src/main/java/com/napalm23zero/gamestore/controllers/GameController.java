package com.napalm23zero.gamestore.controllers;

import com.napalm23zero.gamestore.models.Game;
import com.napalm23zero.gamestore.services.GenericService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Api(tags = "Game")
@RestController
@RequestMapping("/game")
public class GameController extends GenericController<Game, ObjectId> {


    GameController(GenericService service) {
        super(service);
    }


//

//

}
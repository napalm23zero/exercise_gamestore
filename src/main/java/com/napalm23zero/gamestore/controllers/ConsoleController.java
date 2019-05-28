package com.napalm23zero.gamestore.controllers;

import com.napalm23zero.gamestore.models.Console;
import com.napalm23zero.gamestore.services.ConsoleService;
import io.swagger.annotations.Api;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Console")
@RestController
@RequestMapping("/console")
public class ConsoleController extends GenericController<Console, ObjectId> {

    ConsoleController(ConsoleService service) {
        super(service);
    }
}
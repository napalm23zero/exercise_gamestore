package com.napalm23zero.gamestore.controllers;

import com.napalm23zero.gamestore.models.Accessory;
import com.napalm23zero.gamestore.services.AccessoryService;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags = "Accessory")
@RestController
@RequestMapping("/accessory")
public class AccessoryController extends GenericController<Accessory, ObjectId> {
    AccessoryController(AccessoryService service) {
        super(service);
    }
}
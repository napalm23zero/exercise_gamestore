package com.napalm23zero.gamestore.controllers;

import com.napalm23zero.gamestore.models.Accessory;
import com.napalm23zero.gamestore.services.AccessoryService;
import com.napalm23zero.gamestore.services.GenericService;
import com.napalm23zero.gamestore.services.impl.AccessoryServiceImpl;
import io.swagger.annotations.Api;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Accessory")
@RestController
@RequestMapping("/accessory")
public class AccessoryController extends GenericController<Accessory, ObjectId> {

    AccessoryController(AccessoryService service) {
        super(service);
    }
}
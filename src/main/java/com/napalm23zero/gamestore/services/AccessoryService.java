package com.napalm23zero.gamestore.services;

import com.napalm23zero.gamestore.models.Accessory;
import com.napalm23zero.gamestore.repositories.AccessoryRepository;

import org.bson.types.ObjectId;

public interface AccessoryService extends GenericService<Accessory, ObjectId>, AccessoryRepository {
}
package com.napalm23zero.gamestore.repositories;

import com.napalm23zero.gamestore.models.Accessory;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessoryRepository extends GenericRepository<Accessory, ObjectId> {
}
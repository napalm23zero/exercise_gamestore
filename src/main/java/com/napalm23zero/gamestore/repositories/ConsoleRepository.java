package com.napalm23zero.gamestore.repositories;

import com.napalm23zero.gamestore.models.Console;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsoleRepository extends GenericRepository<Console, ObjectId> {
}
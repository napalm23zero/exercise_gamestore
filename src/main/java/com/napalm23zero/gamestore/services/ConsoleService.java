package com.napalm23zero.gamestore.services;

import com.napalm23zero.gamestore.models.Console;
import com.napalm23zero.gamestore.repositories.ConsoleRepository;

import org.bson.types.ObjectId;

public interface ConsoleService extends GenericService<Console, ObjectId>, ConsoleRepository {
}
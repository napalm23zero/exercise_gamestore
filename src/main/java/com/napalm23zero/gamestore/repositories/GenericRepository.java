package com.napalm23zero.gamestore.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GenericRepository<R, D> extends MongoRepository<R, D> {

}
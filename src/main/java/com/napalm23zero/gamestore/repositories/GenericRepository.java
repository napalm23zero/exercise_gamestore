package com.napalm23zero.gamestore.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<R, D> extends MongoRepository<R, D> {
}

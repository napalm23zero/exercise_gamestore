package com.napalm23zero.gamestore.services;

import com.napalm23zero.gamestore.models.Console;
import com.napalm23zero.gamestore.repositories.ConsoleRepository;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.Optional;

public interface ConsoleService extends GenericService<Console, ObjectId>, ConsoleRepository {


    Optional<Console> read(ObjectId id);

    Console update(Console console);

    void delete(Console id);

    Page<Console> list(Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<Console> search(Console console, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<Console> find(Console console, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);
}
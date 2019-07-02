package com.napalm23zero.gamestore.services;

import java.util.Optional;

import com.napalm23zero.gamestore.repositories.GenericRepository;

import org.springframework.data.domain.Sort;

import org.springframework.data.domain.Page;

public interface GenericService<E, D> extends GenericRepository<E, D> {
    E create(E entity);

    Optional<E> read(D id);

    E update(E entity);

    void deleteById(D id);

    Page<E> list(Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<E> search(E entity, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<E> find(E entity, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);
}

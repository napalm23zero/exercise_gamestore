package com.napalm23zero.gamestore.services.impl;

import com.napalm23zero.gamestore.repositories.GenericRepository;
import com.napalm23zero.gamestore.services.GenericService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class GenericServiceImpl<R, D> implements GenericService<R, D> {

    protected final GenericRepository<R, D> genericRepository;

    public GenericServiceImpl(GenericRepository<R, D> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public <S extends R> S save(S entity) {
        return null;
    }

    @Override
    public <S extends R> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<R> findById(D d) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(D d) {
        return false;
    }

    @Override
    public List<R> findAll() {
        return null;
    }

    @Override
    public Iterable<R> findAllById(Iterable<D> ds) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(D d) {

    }

    @Override
    public void delete(R entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends R> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<R> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<R> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends R> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends R> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends R> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends R> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends R> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends R> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends R> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends R> boolean exists(Example<S> example) {
        return false;
    }
}
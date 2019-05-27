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

    private final GenericRepository<R, D> genericRepository;

    public GenericServiceImpl(GenericRepository<R, D> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public <S extends R> S save(S entity) {
        return genericRepository.save(entity);
    }

    @Override
    public <S extends R> List<S> saveAll(Iterable<S> entities) {
        return genericRepository.saveAll(entities);
    }

    @Override
    public Optional<R> findById(D d) {
        return genericRepository.findById(d);
    }

    @Override
    public boolean existsById(D d) {
        return genericRepository.existsById(d);
    }

    @Override
    public List<R> findAll() {
        return genericRepository.findAll();
    }

    @Override
    public Iterable<R> findAllById(Iterable<D> ds) {
        return findAllById(ds);
    }

    @Override
    public long count() {
        return count();
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
        return genericRepository.findAll(sort);
    }

    @Override
    public Page<R> findAll(Pageable pageable) {
        return genericRepository.findAll(pageable);
    }

    @Override
    public <S extends R> S insert(S entity) {
        return genericRepository.insert(entity);
    }

    @Override
    public <S extends R> List<S> insert(Iterable<S> entities) {
        return genericRepository.insert(entities);
    }

    @Override
    public <S extends R> Optional<S> findOne(Example<S> example) {
        return genericRepository.findOne(example);
    }

    @Override
    public <S extends R> List<S> findAll(Example<S> example) {
        return genericRepository.findAll(example);
    }

    @Override
    public <S extends R> List<S> findAll(Example<S> example, Sort sort) {
        return genericRepository.findAll(example, sort);
    }

    @Override
    public <S extends R> Page<S> findAll(Example<S> example, Pageable pageable) {
        return genericRepository.findAll(example, pageable);
    }

    @Override
    public <S extends R> long count(Example<S> example) {
        return genericRepository.count(example);
    }

    @Override
    public <S extends R> boolean exists(Example<S> example) {
        return genericRepository.exists(example);
    }
}

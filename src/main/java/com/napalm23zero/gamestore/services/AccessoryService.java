package com.napalm23zero.gamestore.services;

import com.napalm23zero.gamestore.models.Accessory;
import com.napalm23zero.gamestore.repositories.AccessoryRepository;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.Optional;

public interface AccessoryService extends GenericService<Accessory, ObjectId>, AccessoryRepository {


    Optional<Accessory> read(ObjectId id);

    Accessory update(Accessory accessory);

    void delete(Accessory id);

    Page<Accessory> list(Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<Accessory> search(Accessory accessory, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);

    Page<Accessory> find(Accessory accessory, Integer pageNumber, Integer pageSize, Sort.Direction direction, String orderBy);
}
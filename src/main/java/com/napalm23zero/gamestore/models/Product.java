package com.napalm23zero.gamestore.models;

import java.util.Date;
import java.util.Set;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class Product {
    @Id
    private ObjectId _id;
    private String title;
    private String description;
    private Set<Photo> photos;
    private Boolean isNew;
    private Double price;
    private Date release;
    private Integer stockQty;
}
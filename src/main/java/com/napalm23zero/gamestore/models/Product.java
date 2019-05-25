package com.napalm23zero.gamestore.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public abstract class Product {

    @Id
    private Long _id;

    private String title;

    private String description;

    private Set<Photo> photos;

    private Boolean isNew;

    private Double price;

    private Date release;

    private Integer stockQty;
}
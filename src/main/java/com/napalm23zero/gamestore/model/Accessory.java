package com.napalm23zero.gamestore.model;

import java.util.Date;
import java.util.Set;

import com.napalm23zero.gamestore.enums.Color;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "accessory")
public class Accessory {

    @Id
    private Long _id;

    private String title;

    private String description;

    private Set<Console> console;

    private Set<Game> game;

    private Set<Color> color;

    private Boolean isNew;

    private Double price;

    private Date release;

    private Integer stockQty;

}
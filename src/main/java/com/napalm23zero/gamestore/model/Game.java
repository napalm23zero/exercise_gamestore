package com.napalm23zero.gamestore.model;

import java.util.Date;
import java.util.Set;

import com.napalm23zero.gamestore.enums.AgeRating;
import com.napalm23zero.gamestore.enums.Genre;
import com.napalm23zero.gamestore.enums.Language;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "game")
public class Game {

    @Id
    private Long _id;

    private String title;

    private Set<Genre> genre;

    private String description;

    private AgeRating ageRating;

    private Set<Language> audio;

    private Set<Language> subtitles;

    private Boolean isOnline;

    private Set<Console> platform;

    private Boolean isNew;

    private Double price;

    private Date release;

    private Integer stockQty;

}
package com.napalm23zero.gamestore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "game")
public class Game {

    @Id
    private Long _id;

    @Indexed(unique = true)
    private String title;

}
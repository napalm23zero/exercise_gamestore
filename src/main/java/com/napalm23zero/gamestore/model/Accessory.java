package com.napalm23zero.gamestore.model;

import java.util.Set;

import com.napalm23zero.gamestore.enums.Color;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "product")
public class Accessory extends Product {

    private Set<Console> compatibleConsoles;

    private Set<Game> compatibleGame;

    private Set<Color> color;

}
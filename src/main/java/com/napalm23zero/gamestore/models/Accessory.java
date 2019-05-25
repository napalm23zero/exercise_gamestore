package com.napalm23zero.gamestore.models;

import com.napalm23zero.gamestore.enums.Color;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Getter
@Setter
@Document(collection = "product")
public class Accessory extends Product {

    private Set<Console> compatibleConsoles;

    private Set<Game> compatibleGame;

    private Set<Color> color;

}
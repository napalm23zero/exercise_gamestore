package com.napalm23zero.gamestore.models;

import com.napalm23zero.gamestore.enums.Color;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Getter
@Setter
@Document(collection = "product")
public class Console extends Product {
    private Double storageGb;
    private Set<Color> color;
}
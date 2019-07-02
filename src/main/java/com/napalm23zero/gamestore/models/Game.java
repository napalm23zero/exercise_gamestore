package com.napalm23zero.gamestore.models;

import java.util.Set;

import com.napalm23zero.gamestore.enums.AgeRating;
import com.napalm23zero.gamestore.enums.Genre;
import com.napalm23zero.gamestore.enums.Language;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "product")
public class Game extends Product {
    private Set<Genre> genres;
    private AgeRating ageRating;
    private Set<Language> availableAudios;
    private Set<Language> availableSubtitles;
    private Boolean isOnline;
    private Set<Console> compatibleConsoles;
}
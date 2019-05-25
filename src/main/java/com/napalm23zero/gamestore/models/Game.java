package com.napalm23zero.gamestore.models;

import com.napalm23zero.gamestore.enums.AgeRating;
import com.napalm23zero.gamestore.enums.Genre;
import com.napalm23zero.gamestore.enums.Language;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

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
package com.gdstruc.module6;

public class Game {

    private String name;
    private String description;
    private String genre;
    private String platforms;
    private String feature;

    // Stores the information of each game
    public Game(String name, String description, String genre,
                String platforms, String feature) {

        this.name = name;
        this.description = description;
        this.genre = genre;
        this.platforms = platforms;
        this.feature = feature;
    }

    // Returns the game information
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public String getFeature() {
        return feature;
    }

    // Provides the hint based on the current hint number
    public String getHint(int hintNumber) {

        if (hintNumber == 1) {
            return description;
        } else if (hintNumber == 2) {
            return "Genre: " + genre + " | Available on: " + platforms;
        } else {
            return feature;
        }
    }
}

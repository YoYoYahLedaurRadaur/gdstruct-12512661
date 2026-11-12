package com.gdstruc.module6;

import java.util.ArrayList;

public class LedaThreeHints {

    private static final int DESCRIPTION_HINT = 1;
    private static final int GENRE_PLATFORM_HINT = 2;
    private static final int FEATURE_HINT = 3;

    // Filters the possible games using the current hint
    public ArrayList<Game> search(ArrayList<Game> possibleGames,
                                  Game mysteryGame, int hintNumber) {

        ArrayList<Game> filteredGames = new ArrayList<>();

        for (Game game : possibleGames) {

            if (hintNumber == DESCRIPTION_HINT &&
                    game.getGenre().equals(mysteryGame.getGenre())) {

                filteredGames.add(game);

            } else if (hintNumber == GENRE_PLATFORM_HINT &&
                    game.getGenre().equals(mysteryGame.getGenre()) &&
                    game.getPlatforms().equals(mysteryGame.getPlatforms())) {

                filteredGames.add(game);

            } else if (hintNumber == FEATURE_HINT &&
                    game.getFeature().equals(mysteryGame.getFeature())) {

                filteredGames.add(game);
            }
        }

        return filteredGames;
    }
}
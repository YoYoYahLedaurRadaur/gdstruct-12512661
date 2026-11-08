package com.gdstruc.module4;

public class Player {

    private int playerId;

    // Creates a player with a unique ID
    public Player(int playerId) {
        this.playerId = playerId;
    }

    // Returns the player's ID
    public int getPlayerId() {
        return playerId;
    }

    // Displays the player's ID
    @Override
    public String toString() {
        return "Player " + playerId;
    }
}

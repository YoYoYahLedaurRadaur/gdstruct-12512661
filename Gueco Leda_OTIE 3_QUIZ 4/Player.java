package com.gdstruc.module5;

import java.util.Objects;

public class Player {

    private int playerId;
    private String userName;
    private int level;

    // Creates a player with an ID, username, and level
    public Player(int playerId, String userName, int level) {
        this.playerId = playerId;
        this.userName = userName;
        this.level = level;
    }

    // Returns the player's ID
    public int getPlayerId() {
        return playerId;
    }

    // Returns the player's username
    public String getUserName() {
        return userName;
    }

    // Returns the player's level
    public int getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return playerId == player.playerId &&
                level == player.level &&
                Objects.equals(userName, player.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, userName, level);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", userName='" + userName + '\'' +
                ", level=" + level +
                '}';
    }
}

package com.gdstruc.module2;

import java.util.Objects;

public class Player {

    private int id;
    private String name;
    private int level;

    // Creates a player with the given details
    public Player(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    // Gets the player's ID
    public int getId() {
        return id;
    }

    // Updates the player's ID
    public void setId(int id) {
        this.id = id;
    }

    // Gets the player's name
    public String getName() {
        return name;
    }

    // Updates the player's name
    public void setName(String name) {
        this.name = name;
    }

    // Gets the player's level
    public int getLevel() {
        return level;
    }

    // Updates the player's level
    public void setLevel(int level) {
        this.level = level;
    }

    // Checks if two players have the same ID
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;
        return id == player.id;
    }

    // Generates a hash code using the player's ID
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Displays the player's information
    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}

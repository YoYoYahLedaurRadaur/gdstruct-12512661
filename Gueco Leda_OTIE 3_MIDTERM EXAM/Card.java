package com.gdstruc.midterm;

public class Card {
    private String name;

    // Creates a card with a given name
    public Card(String name) {
        this.name = name;
    }

    // Returns the card's name
    public String getName() {
        return name;
    }

    // Displays the card's name when printed
    @Override
    public String toString() {
        return name;
    }
}




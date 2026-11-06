package com.gdstruc.midterm;

import java.util.ArrayList;

public class CardStack {
    private ArrayList<Card> cards;

    public CardStack() {
        cards = new ArrayList<>();
    }

    // Adds a card to the top of the stack
    public void push(Card card) {
        cards.add(card);
    }

    // Removes and returns the top card
    public Card pop() {
        if (isEmpty()) {
            return null;
        }

        return cards.remove(cards.size() - 1);
    }

    // Returns the top card without removing it
    public Card peek() {
        if (isEmpty()) {
            return null;
        }

        return cards.get(cards.size() - 1);
    }

    // Checks if the stack has no cards
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    // Returns the current number of cards
    public int getSize() {
        return cards.size();
    }
}


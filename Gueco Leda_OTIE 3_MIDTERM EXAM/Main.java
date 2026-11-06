package com.gdstruc.midterm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int DECK_SIZE = 30;
    private static final int MIN_CARDS = 1;
    private static final int MAX_CARDS = 5;
    private static final int COMMAND_COUNT = 3;

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        CardStack playerDeck = new CardStack();
        CardStack discardedPile = new CardStack();

        ArrayList<Card> playerHand = new ArrayList<>();

        String[] cardNames = {
                "Chang'e", "Cecilion", "Cici", "Clint", "Cyclops",
                "Gord", "Ixia", "Joy", "Leomord", "Lylia",
                "Ruby", "Saber", "Wu Zetian", "Yi Sun Shin", "Zhuxin"
        };

        // Create 30 cards using the given hero names
        ArrayList<Card> allCards = new ArrayList<>();

        for (int i = 0; i < DECK_SIZE; i++) {
            Card card = new Card(cardNames[i % cardNames.length]);
            allCards.add(card);
        }

        // Shuffle the cards before adding them to the deck
        Collections.shuffle(allCards);

        for (Card card : allCards) {
            playerDeck.push(card);
        }

        System.out.println("===== CARD STACK GAME =====");
        System.out.println("Starting deck: " + playerDeck.getSize());

        int turn = 1;

        // Continue until the player's deck is empty
        while (!playerDeck.isEmpty()) {

            System.out.println("\nPress Enter to proceed to the next turn...");
            scanner.nextLine();

            int command = random.nextInt(COMMAND_COUNT);
            int amount = random.nextInt(MAX_CARDS) + MIN_CARDS;

            System.out.println("\n===== TURN " + turn + " =====");

            switch (command) {

                case 0:
                    System.out.println("Command: Draw " + amount
                            + (amount == 1 ? " card" : " cards"));

                    int drawCount = Math.min(amount, playerDeck.getSize());

                    for (int i = 0; i < drawCount; i++) {
                        playerHand.add(playerDeck.pop());
                    }

                    System.out.println("Cards drawn: " + drawCount);
                    break;

                case 1:
                    System.out.println("Command: Discard " + amount
                            + (amount == 1 ? " card" : " cards"));

                    int discardCount = Math.min(amount, playerHand.size());

                    for (int i = 0; i < discardCount; i++) {
                        Card card = playerHand.remove(0);
                        discardedPile.push(card);
                    }

                    System.out.println("Cards discarded: " + discardCount);
                    break;

                case 2:
                    System.out.println("Command: Get " + amount
                            + (amount == 1 ? " card" : " cards")
                            + " from discarded pile");

                    int getCount = Math.min(amount, discardedPile.getSize());

                    for (int i = 0; i < getCount; i++) {
                        playerHand.add(discardedPile.pop());
                    }

                    System.out.println("Cards retrieved: " + getCount);
                    break;
            }

            // Display the player's current hand and pile sizes
            System.out.println("\nPlayer's Hand: " + playerHand);
            System.out.println("Remaining Deck: " + playerDeck.getSize());
            System.out.println("Discarded Pile: " + discardedPile.getSize());

            turn++;
        }

        System.out.println("\n===== GAME OVER =====");
        System.out.println("The player's deck is empty!");
        System.out.println("Total Turns: " + (turn - 1));
        System.out.println("Final Hand: " + playerHand);
        System.out.println("Final Discarded Pile: " + discardedPile.getSize());

        scanner.close();
    }
}


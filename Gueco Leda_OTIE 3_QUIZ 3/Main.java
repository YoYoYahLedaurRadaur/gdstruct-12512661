package com.gdstruc.module4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int MIN_PLAYERS = 1;
    private static final int MAX_PLAYERS = 7;
    private static final int PLAYERS_PER_GAME = 5;
    private static final int TARGET_GAMES = 10;
    private static final int QUEUE_CAPACITY = 100;

    public static void main(String[] args) {

        Random random = new Random();







        Scanner scanner = new Scanner(System.in);

        ArrayQueue queue = new ArrayQueue(QUEUE_CAPACITY);

        int playerId = 1;
        int gameCount = 0;
        int turn = 1;

        System.out.println("===== MATCHMAKING SYSTEM =====");

        // Continue until 10 games have been created
        while (gameCount < TARGET_GAMES) {

            System.out.println("\n===== TURN " + turn + " =====");

            int playersJoining = random.nextInt(MAX_PLAYERS)
                    + MIN_PLAYERS;

            System.out.println(playersJoining + " players joined the queue.");

            // Add new players to the queue
            for (int i = 0; i < playersJoining; i++) {
                queue.add(new Player(playerId));
                playerId++;
            }

            queue.printQueue();

            System.out.println("\nPress Enter to end the turn...");
            scanner.nextLine();

            // Start a game if there are at least 5 players
            while (queue.size() >= PLAYERS_PER_GAME
                    && gameCount < TARGET_GAMES) {

                gameCount++;

                System.out.println("\n===== GAME " + gameCount + " =====");
                System.out.println("Players matched:");

                // Remove the first 5 players from the queue
                for (int i = 0; i < PLAYERS_PER_GAME; i++) {
                    System.out.println(queue.remove());
                }

                System.out.println("Game successfully created!");
                System.out.println("Players remaining: " + queue.size());
            }

            turn++;
        }

        System.out.println("\n===== MATCHMAKING COMPLETE =====");
        System.out.println("Total Games Created: " + gameCount);

        queue.printQueue();

        scanner.close();
    }
}
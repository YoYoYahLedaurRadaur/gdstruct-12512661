package com.gdstruc.module5;

public class Main {

    public static void main(String[] args) {

        SimpleHashtable hashtable = new SimpleHashtable();

        Player player1 = new Player(1, "Leda", 10);
        Player player2 = new Player(2, "Ledaur", 20);
        Player player3 = new Player(3, "Ledar", 30);

        // Add players to the hashtable
        hashtable.put("A1", player1);
        hashtable.put("B2", player2);
        hashtable.put("C3", player3);

        System.out.println("===== ORIGINAL HASHTABLE =====");
        hashtable.printHashtable();

        // Find a player
        System.out.println("\n===== GET PLAYER =====");
        System.out.println(hashtable.get("C3"));

        // Remove a player
        System.out.println("\n===== REMOVE PLAYER =====");
        Player removedPlayer = hashtable.remove("B2");
        System.out.println("Removed: " + removedPlayer);

        // Display the hashtable after removal
        System.out.println("\n===== UPDATED HASHTABLE =====");
        hashtable.printHashtable();

        // Check if the remaining players can still be found
        System.out.println("\n===== CHECK REMAINING PLAYERS =====");
        System.out.println("Player A1: " + hashtable.get("A1"));
        System.out.println("Player C3: " + hashtable.get("C3"));
        System.out.println("Player B2: " + hashtable.get("B2"));
    }
}

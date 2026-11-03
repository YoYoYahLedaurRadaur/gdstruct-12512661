package com.gdstruc.module2;

public class PlayerLinkedList {

    private PlayerNode head;
    private int size;

    // Initializes an empty linked list
    public PlayerLinkedList() {
        head = null;
        size = 0;
    }

    // Add a player at the beginning of the list
    public void addToFront(Player player) {

        PlayerNode node = new PlayerNode(player);

        node.setNext(head);
        head = node;

        // Update the size after adding
        size++;
    }

    // Remove the first player in the list
    public Player removeFirst() {

        if (head == null) {
            return null;
        }

        Player removedPlayer = head.getPlayer();

        // Move the head to the next player
        head = head.getNext();

        // Update the size after removing
        size--;

        return removedPlayer;
    }

    // Return the current number of players
    public int getSize() {
        return size;
    }

    // Check if a player exists in the list
    public boolean contains(Player player) {

        PlayerNode current = head;

        // Go through the list until the player is found
        while (current != null) {

            if (current.getPlayer().equals(player)) {
                return true;
            }

            current = current.getNext();
        }

        return false;
    }

    // Find the position of a player in the list
    public int indexOf(Player player) {

        PlayerNode current = head;
        int index = 0;

        // Check each node and keep track of its position
        while (current != null) {

            if (current.getPlayer().equals(player)) {
                return index;
            }

            current = current.getNext();
            index++;
        }

        return -1;
    }

    // Display all players in the list
    public void printList() {

        PlayerNode current = head;

        System.out.print("HEAD -> ");

        // Print each player until the end of the list
        while (current != null) {

            System.out.print(current.getPlayer() + " -> ");
            current = current.getNext();
        }

        System.out.println("null");
    }
}

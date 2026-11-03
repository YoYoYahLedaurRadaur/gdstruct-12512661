package com.gdstruc.module2;

public class PlayerDoublyLinkedList {

    private DoublyPlayerNode head;
    private DoublyPlayerNode tail;
    private int size;

    // Initializes an empty doubly linked list
    public PlayerDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Add a player at the beginning of the list
    public void addToFront(Player player) {

        DoublyPlayerNode node = new DoublyPlayerNode(player);

        if (head == null) {
            tail = node;
        } else {
            node.setNext(head);
            head.setPrevious(node);
        }

        head = node;
        size++;
    }

    // Add a player at the end of the list
    public void addToEnd(Player player) {

        DoublyPlayerNode node = new DoublyPlayerNode(player);

        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
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

        if (head == null) {
            tail = null;
        } else {
            head.setPrevious(null);
        }

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

        DoublyPlayerNode current = head;

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

        DoublyPlayerNode current = head;
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

    // Display the list from beginning to end
    public void printForward() {

        DoublyPlayerNode current = head;

        System.out.print("HEAD -> ");

        // Print each player until the end of the list
        while (current != null) {

            System.out.print(current.getPlayer() + " <-> ");
            current = current.getNext();
        }

        System.out.println("null");
    }

    // Display the list from end to beginning
    public void printBackward() {

        DoublyPlayerNode current = tail;

        System.out.print("TAIL -> ");

        // Print each player until the beginning of the list
        while (current != null) {

            System.out.print(current.getPlayer() + " <-> ");
            current = current.getPrevious();
        }

        System.out.println("null");
    }
}
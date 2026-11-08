package com.gdstruc.module4;

public class ArrayQueue {

    private Player[] queue;
    private int front;
    private int back;

    // Creates a queue with a given capacity
    public ArrayQueue(int capacity) {
        queue = new Player[capacity];
        front = 0;
        back = 0;
    }

    // Adds a player to the back of the queue
    public void add(Player player) {
        if (back == queue.length) {
            throw new IllegalStateException("Queue is full!");
        }

        queue[back] = player;
        back++;
    }

    // Removes and returns the first player
    public Player remove() {
        if (size() == 0) {
            throw new java.util.NoSuchElementException("Queue is empty!");
        }

        Player removedPlayer = queue[front];
        queue[front] = null;
        front++;

        return removedPlayer;
    }

    // Returns the first player without removing them
    public Player peek() {
        if (size() == 0) {
            return null;
        }

        return queue[front];
    }

    // Returns the number of players in the queue
    public int size() {
        return back - front;
    }

    // Displays all players currently in the queue
    public void printQueue() {
        System.out.print("Current Queue: ");

        for (int i = front; i < back; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
}
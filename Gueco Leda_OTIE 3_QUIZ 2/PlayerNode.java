package com.gdstruc.module2;

public class PlayerNode {

    private Player player;
    private PlayerNode next;

    // Creates a node that stores a player
    public PlayerNode(Player player) {
        this.player = player;
        this.next = null;
    }

    // Gets the player stored in this node
    public Player getPlayer() {
        return player;
    }

    // Gets the next node in the list
    public PlayerNode getNext() {
        return next;
    }

    // Sets the next node in the list
    public void setNext(PlayerNode next) {
        this.next = next;
    }
}

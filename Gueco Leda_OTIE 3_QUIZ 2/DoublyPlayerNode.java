package com.gdstruc.module2;

public class DoublyPlayerNode {

    private Player player;
    private DoublyPlayerNode next;
    private DoublyPlayerNode previous;

    // Creates a node that stores a player
    public DoublyPlayerNode(Player player) {
        this.player = player;
        this.next = null;
        this.previous = null;
    }

    // Gets the player stored in this node
    public Player getPlayer() {
        return player;
    }

    // Gets the next node in the list
    public DoublyPlayerNode getNext() {
        return next;
    }

    // Sets the next node in the list
    public void setNext(DoublyPlayerNode next) {
        this.next = next;
    }

    // Gets the previous node in the list
    public DoublyPlayerNode getPrevious() {
        return previous;
    }

    // Sets the previous node in the list
    public void setPrevious(DoublyPlayerNode previous) {
        this.previous = previous;
    }
}

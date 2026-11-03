package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

        // Create some players
        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        // Create a Singly Linked List
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        // Add players to the list
        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        // Display the original list
        System.out.println("===== SINGLY LINKED LIST =====");
        playerLinkedList.printList();

        // Display the current size
        System.out.println("\nSize: " + playerLinkedList.getSize());

        // Check if a player exists
        System.out.println("\nContains Asuna: "
                + playerLinkedList.contains(asuna));

        // Find the position of a player
        System.out.println("Index of Asuna: "
                + playerLinkedList.indexOf(asuna));

        // Remove the first player
        System.out.println("\nRemoved Player: "
                + playerLinkedList.removeFirst());

        // Display the updated list
        System.out.println("\nUpdated Linked List:");
        playerLinkedList.printList();

        // Display the updated size
        System.out.println("\nUpdated Size: "
                + playerLinkedList.getSize());

        // Check if the removed player still exists
        System.out.println("\nContains HPDeskjet: "
                + playerLinkedList.contains(hpDeskjet));

        System.out.println("Index of HPDeskjet: "
                + playerLinkedList.indexOf(hpDeskjet));


        // Create a Doubly Linked List
        System.out.println("\n===== DOUBLY LINKED LIST =====");

        PlayerDoublyLinkedList doublyLinkedList =
                new PlayerDoublyLinkedList();

        // Add players to the list
        doublyLinkedList.addToFront(asuna);
        doublyLinkedList.addToEnd(lethalBacon);
        doublyLinkedList.addToEnd(hpDeskjet);

        // Display the list in both directions
        System.out.println("\nForward:");
        doublyLinkedList.printForward();

        System.out.println("\nBackward:");
        doublyLinkedList.printBackward();

        // Display the current size
        System.out.println("\nSize: " + doublyLinkedList.getSize());

        // Check if a player exists
        System.out.println("\nContains Asuna: "
                + doublyLinkedList.contains(asuna));

        // Find the position of a player
        System.out.println("Index of LethalBacon: "
                + doublyLinkedList.indexOf(lethalBacon));

        // Remove the first player
        System.out.println("\nRemoved Player: "
                + doublyLinkedList.removeFirst());

        // Display the updated list
        System.out.println("\nUpdated Forward:");
        doublyLinkedList.printForward();

        System.out.println("\nUpdated Backward:");
        doublyLinkedList.printBackward();

        // Display the updated size
        System.out.println("\nUpdated Size: "
                + doublyLinkedList.getSize());


        // Test an empty Singly Linked List
        System.out.println("\n===== SINGLY LINKED LIST EDGE CASES =====");

        PlayerLinkedList emptyList = new PlayerLinkedList();

        // Check the size and remove from an empty list
        System.out.println("Initial Size: " + emptyList.getSize());
        System.out.println("Remove from empty list: "
                + emptyList.removeFirst());

        // Add one player and remove it
        emptyList.addToFront(asuna);

        System.out.println("\nRemove the only player: "
                + emptyList.removeFirst());

        // Check if the list is empty
        System.out.println("Updated Size: " + emptyList.getSize());
        emptyList.printList();


        // Test an empty Doubly Linked List
        System.out.println("\n===== DOUBLY LINKED LIST EDGE CASES =====");

        PlayerDoublyLinkedList emptyDoublyList =
                new PlayerDoublyLinkedList();

        // Check the size and remove from an empty list
        System.out.println("Initial Size: "
                + emptyDoublyList.getSize());

        System.out.println("Remove from empty list: "
                + emptyDoublyList.removeFirst());

        // Add one player and remove it
        emptyDoublyList.addToFront(asuna);

        System.out.println("\nRemove the only player: "
                + emptyDoublyList.removeFirst());

        // Check if the list is empty
        System.out.println("Updated Size: "
                + emptyDoublyList.getSize());

        // Display the empty list in both directions
        System.out.println("\nForward:");
        emptyDoublyList.printForward();

        System.out.println("Backward:");
        emptyDoublyList.printBackward();
    }
}

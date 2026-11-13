package com.gdstruc.module7;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        // Inserts values into the tree
        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

        // Displays the tree in ascending order
        System.out.println("In-Order Traversal:");
        tree.traverseInOrder();

        // Displays the smallest value
        System.out.println("\nMinimum Value:");
        Node min = tree.getMin();
        System.out.println(min.getData());

        // Displays the largest value
        System.out.println("\nMaximum Value:");
        Node max = tree.getMax();
        System.out.println(max.getData());

        // Displays the tree in descending order
        System.out.println("\nDescending In-Order Traversal:");
        tree.traverseInOrderDescending();

    }
}
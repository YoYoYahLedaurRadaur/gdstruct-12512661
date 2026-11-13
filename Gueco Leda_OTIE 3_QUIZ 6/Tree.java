package com.gdstruc.module7;

public class Tree {

    private Node root;

    // Inserts a value into the tree
    public void insert(int value) {

        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    // Traverses the tree in ascending order
    public void traverseInOrder() {

        if (root != null) {
            root.traverseInOrder();
        }
    }

    // Searches for a node with the given value
    public Node get(int value) {

        if (root != null) {
            return root.get(value);
        }

        return null;
    }

    // Gets the node with the smallest value
    public Node getMin() {

        if (root == null) {
            return null;
        }

        Node current = root;

        while (current.getLeftChild() != null) {
            current = current.getLeftChild();
        }

        return current;
    }

    // Gets the node with the largest value
    public Node getMax() {

        if (root == null) {
            return null;
        }

        Node current = root;

        while (current.getRightChild() != null) {
            current = current.getRightChild();
        }

        return current;
    }

    // Traverses the tree in descending order
    public void traverseInOrderDescending() {
        traverseInOrderDescending(root);
    }

    // Visits the right child, current node, and left child
    private void traverseInOrderDescending(Node node) {

        if (node != null) {

            if (node.getRightChild() != null) {
                traverseInOrderDescending(node.getRightChild());
            }

            System.out.println(node.getData());

            if (node.getLeftChild() != null) {
                traverseInOrderDescending(node.getLeftChild());
            }
        }
    }
}
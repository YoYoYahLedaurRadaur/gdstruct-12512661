package com.gdstruc.module7;

public class Node {

    private int data;
    private Node rightChild;
    private Node leftChild;

    // Stores the value of the node
    public Node(int _data) {
        this.data = _data;
    }

    // Returns the node value
    public int getData() {
        return data;
    }

    // Updates the node value
    public void setData(int data) {
        this.data = data;
    }

    // Returns the right child
    public Node getRightChild() {
        return rightChild;
    }

    // Sets the right child
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    // Returns the left child
    public Node getLeftChild() {
        return leftChild;
    }

    // Sets the left child
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    // Inserts a value into the correct position
    public void insert(int value) {

        if (value == data) {
            return;
        }

        if (value < data) {

            if (leftChild == null) {
                leftChild = new Node(value);
            } else {
                leftChild.insert(value);
            }

        } else {

            if (rightChild == null) {
                rightChild = new Node(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    // Traverses the tree from smallest to largest
    public void traverseInOrder() {

        if (leftChild != null) {
            leftChild.traverseInOrder();
        }

        System.out.println(data);

        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    // Searches for a node with the given value
    public Node get(int value) {

        if (value == data) {
            return this;
        }

        if (value < data) {

            if (leftChild != null) {
                return leftChild.get(value);
            }

        } else {

            if (rightChild != null) {
                return rightChild.get(value);
            }
        }

        return null;
    }
}
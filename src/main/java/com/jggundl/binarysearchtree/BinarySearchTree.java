package com.jggundl.binarysearchtree;

/**
 * BinarySearchTree
 */
public class BinarySearchTree {

    private Node head;

    public BinarySearchTree() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addValue(int value) {
        if (head == null) {
            head = new Node(value);
        }

        Node current = head;
        while (current.getLeft() != null && current.getRight() != null) {
            if (value > current.getValue()) {
                current = current.getRight();
            } else if (value < current.getValue()) {
                current = current.getLeft();
            } else {
                return; // TODO: handle duplicates
            }
        }

        if (value > current.getValue()) {
            current.setRight(new Node(value));
        } else if (value < current.getValue()) {
            current.setLeft(new Node(value));
        } else {
            return; // TODO: handle duplicates
        }
    }

}

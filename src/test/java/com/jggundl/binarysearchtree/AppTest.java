package com.jggundl.binarysearchtree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void emptyBinarySearchTreeTest() {
        final BinarySearchTree bst = new BinarySearchTree();
        assertTrue(bst.getHead() == null);
    }

    @Test
    public void addSingleValueTest() {
        final BinarySearchTree bst = new BinarySearchTree();
        bst.addValue(10);
        assertTrue(bst.getHead().getValue() == 10);
    }

}

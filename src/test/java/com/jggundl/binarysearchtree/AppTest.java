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
        final int EXPECTED_HEAD_VALUE = 10;

        final BinarySearchTree bst = new BinarySearchTree();
        bst.addValue(EXPECTED_HEAD_VALUE);

        assertTrue(bst.getHead().getValue() == EXPECTED_HEAD_VALUE);
    }

    @Test
    public void addLeftValueTest() {
        final int EXPECTED_HEAD_VALUE = 10;
        final int EXPECTED_LEFT_VALUE = 5;

        final BinarySearchTree bst = new BinarySearchTree();

        bst.addValue(EXPECTED_HEAD_VALUE);
        bst.addValue(EXPECTED_LEFT_VALUE);
        assertTrue(bst.getHead().getValue() == EXPECTED_HEAD_VALUE);
        assertTrue(bst.getHead().getLeft().getValue() == EXPECTED_LEFT_VALUE);
    }

    @Test
    public void addRightValueTest() {
        final int EXPECTED_HEAD_VALUE = 10;
        final int EXPECTED_RIGHT_VALUE = 15;

        final BinarySearchTree bst = new BinarySearchTree();

        bst.addValue(EXPECTED_HEAD_VALUE);
        bst.addValue(EXPECTED_RIGHT_VALUE);
        assertTrue(bst.getHead().getValue() == EXPECTED_HEAD_VALUE);
        assertTrue(bst.getHead().getRight().getValue() == EXPECTED_RIGHT_VALUE);
    }

    @Test
    public void addLeftAndRightValuesTest() {
        final int EXPECTED_HEAD_VALUE = 10;
        final int EXPECTED_LEFT_VALUE = 5;
        final int EXPECTED_RIGHT_VALUE = 15;

        final BinarySearchTree bst = new BinarySearchTree();
        bst.addValue(EXPECTED_HEAD_VALUE);
        bst.addValue(EXPECTED_LEFT_VALUE);
        bst.addValue(EXPECTED_RIGHT_VALUE);

        assertTrue(bst.getHead().getValue() == EXPECTED_HEAD_VALUE);
        assertTrue(bst.getHead().getLeft().getValue() == EXPECTED_LEFT_VALUE);
        assertTrue(bst.getHead().getRight().getValue() == EXPECTED_RIGHT_VALUE);
    }

}

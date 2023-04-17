package org.example.adt;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @org.junit.jupiter.api.Test
    void getValue() {
        Node node = new Node(3, null);
        int value = node.getValue();

        assertEquals(3, value);
    }

    @org.junit.jupiter.api.Test
    void setValue() {
        Node node = new Node(3, null);
        node.setValue(4);

        assertEquals(4, node.getValue());
    }

    @org.junit.jupiter.api.Test
    void getNext() {
        Node node = new Node(3, null);
        node.getNext();

        assertEquals(null, node.getNext());
    }

    @org.junit.jupiter.api.Test
    void setNext() {
        Node node = new Node(3, null);
        Node nextNode = new Node(4, null);
        node.setNext(nextNode);

        assertEquals(nextNode, node.getNext());
    }
}
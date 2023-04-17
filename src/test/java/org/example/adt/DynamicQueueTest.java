package org.example.adt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicQueueTest {

    @Test
    void add() {
        DynamicQueue dynamicQueue = new DynamicQueue();
        dynamicQueue.add(4);

        assertEquals(4, dynamicQueue.getFirst());
    }

    @Test
    void remove() {
        DynamicQueue dynamicQueue = new DynamicQueue();

        Exception exception = assertThrows(RuntimeException.class, () -> {
            dynamicQueue.remove();
        });
        String expectedMessage = "No se puede desacolar una cola vacia";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void isEmpty() {
        DynamicQueue dynamicQueue = new DynamicQueue();

        assertEquals(true, dynamicQueue.isEmpty());
    }

    @Test
    void getFirst() {
        DynamicQueue dynamicQueue = new DynamicQueue();

        Exception exception = assertThrows(RuntimeException.class, () -> {
            dynamicQueue.getFirst();
        });
        String expectedMessage = "No se puede obtener el primero una cola vacia";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
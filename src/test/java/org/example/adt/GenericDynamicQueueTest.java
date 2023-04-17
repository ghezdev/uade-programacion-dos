package org.example.adt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericDynamicQueueTest {

    @Test
    void add() {
        GenericDynamicQueue<String> genericDynamicQueue = new GenericDynamicQueue<>();
        genericDynamicQueue.add("Hola");

        assertEquals("Hola", genericDynamicQueue.getFirst());
    }

    @Test
    void remove() {
        GenericDynamicQueue<String> genericDynamicQueue = new GenericDynamicQueue<>();

        Exception exception = assertThrows(RuntimeException.class, () -> {
            genericDynamicQueue.remove();
        });
        String expectedMessage = "No se puede desacolar una cola vacia";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void isEmpty() {
        GenericDynamicQueue<String> genericDynamicQueue = new GenericDynamicQueue<>();

        assertEquals(true, genericDynamicQueue.isEmpty());
    }

    @Test
    void getFirst() {
        GenericDynamicQueue<String> genericDynamicQueue = new GenericDynamicQueue<>();

        Exception exception = assertThrows(RuntimeException.class, () -> {
            genericDynamicQueue.getFirst();
        });
        String expectedMessage = "No se puede obtener el primero una cola vacia";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
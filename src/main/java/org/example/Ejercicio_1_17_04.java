package org.example;

import org.example.adt.BinaryTree;

public class Ejercicio_1_17_04 {

    public static void init() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.initialize(1);
        binaryTree.addLeft(2);
        binaryTree.addRight(3);

        binaryTree.getLeft().addLeft(4);
        binaryTree.getLeft().getLeft().addLeft(5);

        System.out.println("height(binaryTree)");
        System.out.println(height(binaryTree));
    }

    // Para ordenar un árbol, existen estos casos
    // in order: Left - Root - Right
    // pre order: Root - Left - Right
    // post order: Left - Right - Root

    public int weight(BinaryTree binaryTree) {
        if(binaryTree == null || binaryTree.isEmpty()) {
            return 0;
        }
        return 1 + weight(binaryTree.getLeft()) + weight(binaryTree.getRight());
    }

    static public int height(BinaryTree binaryTree) {
        if(binaryTree == null || binaryTree.isEmpty()) {
            return 0;
        }
        int heightLeft = 0;
        if(binaryTree.getLeft() != null) {
            heightLeft = 1 + height(binaryTree.getLeft());
        }
        int heightRight = 0;
        if(binaryTree.getRight() != null) {
            heightRight = 1 + height(binaryTree.getRight());
        }

        return Math.max(heightLeft, heightRight);
    }

    // ---- Lo que hizo el profe ----
    // public int height(BinaryTree binaryTree) {
    //     if(binaryTree == null || binaryTree.isEmpty()) {
    //         return 0;
    //     }
    //     return 1 + Math.max(height(binaryTree.getLeft()), height(binaryTree.getRight()));
    // }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        System.out.println(binaryTree.isEmpty());
        binaryTree.initialize(1);
        binaryTree.addLeft(2);
        binaryTree.addRight(3);

        binaryTree.getLeft().addLeft(4);
        binaryTree.getLeft().getLeft().addLeft(5);

        print(binaryTree);
    }

    public static void print(BinaryTree binaryTree) { // in order
        if(binaryTree.isEmpty()) {
            return;
        }
        if(binaryTree.getLeft() != null) {
            print(binaryTree.getLeft());
        }
        System.out.println(binaryTree.getValue());
        if(binaryTree.getRight() != null) {
            print(binaryTree.getRight());
        }
    }
}

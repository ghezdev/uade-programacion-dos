package org.example.adt;

public class BinaryTree {
    private NodeOfBinaryTree root;

    public void initialize(int value) {
        this.root = new NodeOfBinaryTree(value, null, null);
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int getValue() {
        if (this.isEmpty()) {
            throw new RuntimeException("AB instance is empty");
        }
        return this.root.getValue();
    }

    public BinaryTree getLeft() {
        if (this.isEmpty()) {
            throw new RuntimeException("AB instance is empty");
        }
        return this.root.getLeft();
    }

    public BinaryTree getRight() {
        if (this.isEmpty()) {
            throw new RuntimeException("AB instance is empty");
        }
        return this.root.getRight();
    }

    public void removeLeft() {
        if (this.isEmpty()) {
            throw new RuntimeException("AB instance is empty");
        }
        this.root.setLeft(null);
    }

    public void removeRight() {
        if (this.isEmpty()) {
            throw new RuntimeException("AB instance is empty");
        }
        this.root.setRight(null);
    }

    public void addLeft(int value) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.initialize(value);
        this.root.setLeft(binaryTree);
    }

    public void addRight(int value) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.initialize(value);
        this.root.setRight(binaryTree);
    }

}

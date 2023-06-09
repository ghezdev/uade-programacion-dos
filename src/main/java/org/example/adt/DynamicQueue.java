package org.example.adt;

public class DynamicQueue implements IQueue {

    private Node first;

    @Override
    public void add(int a) {
        Node node = new Node(a, null);
        if(this.first == null) {
            this.first = node;
            return;
        }
        Node candidate = this.first;
        while(candidate.getNext() != null) {
            candidate = candidate.getNext();
        }
        candidate.setNext(node);
    }

    @Override
    public void remove() {
        if(this.first == null) {
            System.out.println("No se puede desacolar una cola vacia");
            throw new RuntimeException("No se puede desacolar una cola vacia");
        }
        this.first = this.first.getNext();
    }

    @Override
    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public int getFirst() {
        if(this.first == null) {
            System.out.println("No se puede obtener el primero una cola vacia");
            throw new RuntimeException("No se puede obtener el primero una cola vacia");
        }
        return this.first.getValue();
    }
}

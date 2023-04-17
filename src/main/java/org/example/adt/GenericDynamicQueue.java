package org.example.adt;

public class GenericDynamicQueue<T> implements IGenericQueue<T> {

    private GenericNode<T> first;

    @Override
    public void add(T a) {
        GenericNode genericNode = new GenericNode(a, null);
        if(this.first == null) {
            this.first = genericNode;
            return;
        }
        GenericNode candidate = this.first;
        while(candidate.getNext() != null) {
            candidate = candidate.getNext();
        }
        candidate.setNext(genericNode);
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
    public T getFirst() {
        if(this.first == null) {
            System.out.println("No se puede obtener el primero una cola vacia");
            throw new RuntimeException("No se puede obtener el primero una cola vacia");
        }
        return this.first.getValue();
    }
}

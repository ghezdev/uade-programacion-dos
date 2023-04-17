package org.example.adt;

public class DynamicStack implements IStack {

    private Node first;

    @Override
    public void add(int a) {
        this.first = new Node(a, this.first);
    }

    @Override
    public void remove() {
        if(this.first == null) {
            System.out.println("No se puede desapilar una pila vacía");
            return;
        }
        this.first = this.first.getNext();
    }

    @Override
    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public int getTop() {
        if(this.first == null) {
            System.out.println("No se puede obtener el tope una pila vacía");
            return -1;
        }
        return this.first.getValue();
    }
}

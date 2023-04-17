package org.example.adt;

public class GenericDynamicStack<T> implements IGenericStack<T> {

    private GenericNode<T> first;

    @Override
    public void add(T a) {
        this.first = new GenericNode<>(a, this.first);
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
    public T getTop() {
        if(this.first == null) {
            System.out.println("No se puede obtener el tope una pila vacía");
            throw new RuntimeException();
        }
        return this.first.getValue();
    }
}

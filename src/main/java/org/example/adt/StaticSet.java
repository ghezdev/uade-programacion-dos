package org.example.adt;

import java.util.Random;

public class StaticSet implements ISet {

    private final int[] array;
    private int count;

    public StaticSet() {
        this.array = new int[10000];
        this.count = 0;
    }

    @Override
    public void add(int a) {
        for(int i = 0; i < this.count; i++) {
            if(this.array[i] == a) {
                return;
            }
        }

        this.array[this.count] = a;
        this.count++;
    }

    @Override
    public void remove(int a) {
        for(int i = 0; i < this.count; i++) {
            if(this.array[i] == a) {
                if(i == this.count - 1) {
                    this.count--;
                    return;
                }
                this.array[i] = this.array[this.count - 1];
                this.count--;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public int choose() {
        int randomIndex = (new Random()).nextInt(this.count);
        return this.array[randomIndex];
    }
}

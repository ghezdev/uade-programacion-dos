package org.example;

import org.example.adt.DynamicSet;
import org.example.adt.Node;

public class Ejercicio_1_10_04 {

    // Dado dos conjuntos C1 y C2, determinar si hay un elemento en C1
    // que es menor a todos los elementos de C2.
    // C1 = {1, 7, -2}
    // C2 = {-3, 1, 3}
    public static void main(String[] args) {
        DynamicSet C1 = new DynamicSet();
        DynamicSet C2 = new DynamicSet();
        C1.add(1);
        C1.add(7);
        C1.add(-2);
        C2.add(-3);
        C2.add(1);
        C2.add(3);
        do {
            DynamicSet auxC1 = C1;
            System.out.println("C1");
            int maxMenor = auxC1.choose();
            System.out.println("maxMenor");
            System.out.println(maxMenor);
            DynamicSet auxC2 = C2;
            do {
                System.out.println("candidate");
                System.out.println(auxC2.isEmpty());
                int candidate = auxC2.choose();
                System.out.println(candidate);
                if (maxMenor >= candidate) {
                    break;
                }
                auxC2.remove(candidate);
            } while(!auxC2.isEmpty());
            if (auxC2.isEmpty()) {
                System.out.println(maxMenor);
                break;
            }
            System.out.println("otro loop");
            auxC1.remove(maxMenor);
        } while(!C1.isEmpty());
    }
}

package org.example;

import org.example.adt.GenericDynamicQueue;
import org.example.adt.GenericDynamicStack;

import java.util.Random;

public class Main {

    //Dada una cola de N pilas con N elementos (entonces tendra forma matricial), calcular la traza
    public static void main(String[] args) {
        obtenerTraza(3);
    }
    
    public static void obtenerTraza(int dimension) {
        final int N = dimension;

        int countRow = 0;
        GenericDynamicQueue<GenericDynamicStack<Integer>> matrix = new GenericDynamicQueue<>();
        while (countRow < N) {
            GenericDynamicStack<Integer> stack = new GenericDynamicStack<>();
            int countCol = 0;
            while(countCol < N) {
                stack.add((new Random()).nextInt(10 - 2) + 1);
                countCol++;
            }
            matrix.add(stack);
            countRow++;
        }

        int traza = 0;
        countRow = N;
        int[][] arrayMatrix = new int[N][N];
        while (!matrix.isEmpty()) {
            int countCol = N;
            while (!matrix.getFirst().isEmpty()) {
                System.out.print(String.format("Fila: %s - Columna: %s - Valor: %s | ", N - countRow, countCol, matrix.getFirst().getTop()));

                arrayMatrix[N - countRow][N - countCol] = matrix.getFirst().getTop();

                if (countCol == countRow) {
                    traza += matrix.getFirst().getTop();
                }
                countCol--;
                matrix.getFirst().remove();
            }
            countRow--;
            System.out.println();
            matrix.remove();
        }

        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                System.out.print(arrayMatrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }

        System.out.print("Valor de la traza: ");
        System.out.print(traza);
    }

    public static void calculateTransposed(int dimension) {
        final int N = dimension;

        int countRow = 0;
        GenericDynamicQueue<GenericDynamicStack<Integer>> matrix = new GenericDynamicQueue<>();
        while (countRow < N) {
            GenericDynamicStack<Integer> stack = new GenericDynamicStack<>();
            int countCol = 0;
            while(countCol < N) {
                stack.add((new Random()).nextInt(10 - 2) + 1);
                countCol++;
            }
            matrix.add(stack);
            countRow++;
        }

        // Recorre
        // |
        // V <-

        // Guarda
        // A
        // | ->
        GenericDynamicStack<GenericDynamicQueue<Integer>> matrixTransposed = new GenericDynamicStack<>();
        while (!matrix.isEmpty()) {
            GenericDynamicQueue<Integer> queue = new GenericDynamicQueue<>();

            while (!matrix.getFirst().isEmpty()) {
                System.out.print(matrix.getFirst().getTop());
                System.out.print(' ');
                queue.add(matrix.getFirst().getTop());
                matrix.getFirst().remove();
            }

            System.out.println();
            matrixTransposed.add(queue);
            matrix.remove();
        }

        System.out.println("Transpuesta");
        System.out.println(matrixTransposed.getTop().getFirst());
        matrixTransposed.getTop().remove();
        System.out.println(matrixTransposed.getTop().getFirst());
        matrixTransposed.getTop().remove();
        System.out.println(matrixTransposed.getTop().getFirst());

        // Recorre
        // |
        // V <-
        /* while (!matrixTransposed.isEmpty()) {
            while (!matrixTransposed.getTop().isEmpty()) {
                System.out.print(matrixTransposed.getTop().getFirst());
                System.out.print(' ');
                matrixTransposed.getTop().remove();
            }
            System.out.println();
            matrixTransposed.remove();
        } */
    }
}
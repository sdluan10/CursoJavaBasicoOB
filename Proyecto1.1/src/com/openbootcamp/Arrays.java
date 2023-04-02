package com.openbootcamp;

public class Arrays {
    public static void main(String[] args) {

        int[] notas = {5, 2, 9, 1, 3, 8, 10,};

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);

        }

        for (int item : notas) {
            System.out.println(item);
        }


    }
}

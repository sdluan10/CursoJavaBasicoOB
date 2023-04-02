package com.openbootcamp;

import java.util.Scanner;

public class ScannerMain {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un nombre");

        String nombre = scanner.nextLine();

        System.out.println("introduce un numero");

        int numero = scanner.nextInt();

        System.out.println("el nombre introducido es: " + nombre);
        System.out.println("el numero introducido es: " + numero);



        System.out.println("hola mundo");
    }
}

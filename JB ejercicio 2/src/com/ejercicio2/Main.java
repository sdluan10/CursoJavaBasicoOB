package com.ejercicio2;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precioInicial, IVA;

        System.out.println("ingrese el precio total de la compra: ");
        precioInicial = scanner.nextDouble();

        IVA = precioTotal(precioInicial);

        System.out.println("el precio total iva incluido es de :  " + (precioInicial+IVA));



    }
    static double precioTotal(double precio) {
        double IVA;
        IVA = precio * 0.19;
        return IVA;

    }


}

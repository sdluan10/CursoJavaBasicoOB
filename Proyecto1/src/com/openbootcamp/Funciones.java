package com.openbootcamp;

public class Funciones {


    public static void main(String[] args) {
        
        //HolaMundo();
        //HolaMundo();

        String hola = DevolverHola();
        System.out.println(hola);

        //HolaMundo("luis");
        //HolaMundo("jose");

    }

    private static void HolaMundo() {

        System.out.println("Hola mundo");
        System.out.println("Hola mundo");

    }

    private static void HolaMundo(String name) {

        System.out.println("Hola " + name);

    }
    private static String DevolverHola() {
        return "Hola";

    }


    private static int suma(int num1, int num2){
        return num1 + num2;
    }



}

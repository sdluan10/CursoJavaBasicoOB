package com.openbootcamp;

public class Funciones {
    private static double getPrice() {
        return 100.99;
    }

    /*
     *void indica que no devuelve nada
     */
    static void showMenu() {
        System.out.println("Bienvenidos al E-commerce de zapatillas");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    }

    static String getMenu() {
        System.out.println("Imprimiendo texto prueba");
        return "Bienvenidos al E-commerce de zapatillas: \n 1 - Ver zapatillas...";
    }

    public static void main(String[] args) {


        // opcion 1: funcion sin parametros y sin tipo de retorno
        //showMenu();
        //showMenu();

        //opcion 2: funcion sin parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(price);

        //opcion 3:
        //  funcion con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootcamp");

        //opcion 4:
        // funcion con parametros y con tipo de retorno
        String nombre = "luis";
        String apellido = "saldarriaga";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultadoSuma = suma(50, 200);

    }
    static int suma(int numero1, int numero2){
        return numero1 + numero2;

    }
    static String obtenerSaludo(String nombre, String apeliido){
        return "Buenas Tardes " + nombre + " " + apeliido;

    }



    static void imprimirSaludoBuenosDias(String nombre){
        System.out.println("buenas tardes " + nombre);
    }


}

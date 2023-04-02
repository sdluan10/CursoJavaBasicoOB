package com.openbootcamp;

public class Switch {
    public static void main(String[] args) {

        String clima = "lluvioso";

        switch (clima) {

            case "soleado":
                System.out.println("el clima es Soleado");
                break;
            case "nublado":
                System.out.println("el clima es Nublado");
                break;
            case "lluvioso":
                System.out.println("el clima es lluvioso");
                break;
                default:
                    System.out.println("Clima no encontrado");
                    break;


        }
    }
}

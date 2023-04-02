package com.openbootcamp;

public class CocheMain {

    public static void main(String[] args) {


        String coche = "alfa romeo";
        Coche cocheobj = new Coche();


        Coche cocheobj2 = new Coche("azul", "renault", "civic", 1342.11, 4.9);

        cocheobj2.acelerar(50);

        System.out.println(cocheobj2);

        cocheobj2.peso = 1234.56;

        System.out.println(cocheobj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "motor 10kva";
        cocheElectrico.color = "negro";
        cocheElectrico.fabricante = "kia";
        cocheElectrico.modelo = "mia kalifha";

        System.out.println(cocheElectrico);

        CocheHibrido cocheHibrido = new CocheHibrido();

        cocheHibrido.motorhibrido = "motor 10kva";
        cocheHibrido.color = "negro";
        cocheHibrido.fabricante = "kia";
        cocheHibrido.modelo = "mia kalifha";

        System.out.println(cocheHibrido);



    }
}


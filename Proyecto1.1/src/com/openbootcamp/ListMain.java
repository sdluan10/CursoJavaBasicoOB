package com.openbootcamp;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Ana");
        nombres.add("luis");

        System.out.println(nombres);

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("ford fiesta"));
        coches.add(new Coche("kia picanto"));
        coches.add(new Coche("toyota prado"));


        System.out.println(coches);

        for(Coche coche : coches){
            System.out.println(coche);
        }



    }
}

package com.openbootcamp.Interfaces;

import com.openbootcamp.Coche;

public class InterfacesMain {

    public static void main(String[] args) {


        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheserviceSportImpl();

        Coche coche1 = service1.crearCocheDemo();


        Coche coche2 = service2.crearCocheDemo();

    }
}

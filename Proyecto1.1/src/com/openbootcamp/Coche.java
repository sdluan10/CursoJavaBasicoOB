package com.openbootcamp;

public class Coche {

    String name = "nombre de coches";



    public Coche() {}
    public Coche(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                '}';
    }
}

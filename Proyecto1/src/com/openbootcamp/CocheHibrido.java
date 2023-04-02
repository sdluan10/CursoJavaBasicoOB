package com.openbootcamp;

public class CocheHibrido extends Coche{

    String motorhibrido;

    public CocheHibrido(){

    }

    public CocheHibrido(String motorhibrido) {
        this.motorhibrido = motorhibrido;

    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "motorhibrido='" + motorhibrido + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}

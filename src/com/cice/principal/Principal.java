package com.cice.principal;

import com.cice.clases.Coche;

public class Principal {
    public static void main (String[] args){

        Coche coche1 = new Coche();
        coche1.pintarInformation();

        coche1.setModelo("Astra");
        coche1.setMatricula("1111GGG");
        coche1.setColor("Rojo");
        coche1.setPotencia(90);

        coche1.pintarInformation();
        System.out.println("jjss");

        Coche coche2 = new Coche("2323CDC","Mercedes","Azul",120);
        coche2.pintarInformation();

    }
}

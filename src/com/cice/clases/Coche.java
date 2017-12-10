package com.cice.clases;

public class Coche {

    String matricula;
    String modelo;
    int potencia;
    String color;


    public Coche(){
        matricula = "0000BBB";//Constructor por defecto
        modelo = "Desconocido";
        potencia = 0;
        color = "Desconocido";

    }

    public Coche(String mat, String mod, String col, int pot){
        //Constructor con parámetros
        matricula = mat;
        modelo = mod;
        color = col;
        potencia = pot;

    }


    public void setMatricula(String mat){
        matricula = mat;
    }

    public void setModelo(String mod){
        modelo = mod;
    }

    public void setPotencia(int pot){
        potencia=pot;
    }

    public void setColor(String col){
        color = col;
    }

    public void pintarInformation(){

        System.out.println("Información Coche");
        System.out.println("*******************");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Color: " + color );

    }


}

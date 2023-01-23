package com.unisys.proyectoejemplo.ejercicios;

public class CasaApp {
    public static void main(String[] args) {
        Chalet chalet = new Chalet("Orense",150,3);
        System.out.println(chalet);
        ChaletDeLujo chaletDeLujo = new ChaletDeLujo("Orense",150,3, 10);
        System.out.println(chaletDeLujo);
        Piso piso = new Piso("Orense",150,18);
        System.out.println(piso);
    }
}

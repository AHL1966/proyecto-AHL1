package com.unisys.proyectoejemplo.ejercicios;

import java.sql.SQLOutput;

public class EstaticaApp {
    public static void main(String[] args) {
    Estatica miVar = new Estatica();
    miVar.berrinche = "Aaaaarrgggh";
    System.out.println(miVar);
    System.out.println(miVar.Berrinche());
    }
}

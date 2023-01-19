package com.unisys.proyectoejemplo.ejercicios;

import java.util.Date;
public class DatoLombokApp {
    public static void main(String[] args) {
    DatoLombok miVar = new DatoLombok();
    miVar.setName("Alfonso");
    miVar.setAge(56);
    System.out.println(miVar);
    //DatoLombok tuVar = new DatoLombok("Perico", 27);
    //System.out.println(tuVar);
    miVar.setFechaNacimiento(new Date(4,5,1966));
        System.out.println(miVar);
    }
}

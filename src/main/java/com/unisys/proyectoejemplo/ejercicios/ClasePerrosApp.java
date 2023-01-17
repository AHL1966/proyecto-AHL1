package com.unisys.proyectoejemplo.ejercicios;

public class ClasePerrosApp {
    public static void main(String[] args) {
    ClasePerros toby = new ClasePerros();
    System.out.println("La raza de toby es: "+toby.raza);
    toby.raza = "Terrier";
    ClasePerros otto = new ClasePerros();
    System.out.println("La raza de otto es: "+otto.raza);
    otto.raza = "Pastor Aleman";
    System.out.println("La raza de toby es: "+toby.raza);
    System.out.println("La raza de otto es: "+otto.raza);
    ClasePerros fluky = new ClasePerros("Pastor de Aguas");
    System.out.println("La raza de fluky es: "+fluky.raza);

    }
}

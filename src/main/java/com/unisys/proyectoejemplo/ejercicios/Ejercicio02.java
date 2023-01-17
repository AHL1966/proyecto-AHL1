package com.unisys.proyectoejemplo.ejercicios;

public class Ejercicio02 {
    public static void main(String[] args) {
// Ejercicio 4
        System.out.println("****** Ejercicio 4 *******");
        int i = 0;
        while (i<10){
            i++;
            System.out.println("Contenido de i= "+i);
        }
// Ejercicio 5
        System.out.println("****** Ejercicio 5 *******");
        i = 0;
        do {
            i++;
            System.out.println("Contenido de i= "+i);
        }while(i<10);
// Ejercicio 6
        System.out.println("****** Ejercicio 6 *******");
        for (i=1;i<11;i++) {
            System.out.println("Contenido de i= "+i);
        }
// Ejercicio 7
        System.out.println("****** Ejercicio 7 *******");
        int edad;
        edad = 27;
        if (edad>=18){
            System.out.println("Puedes conducir chaval");
        }
        else {
            System.out.println("NO Puedes conducir chaval");
        }
// Ejercicio 8
        System.out.println("****** Ejercicio 8 *******");
        edad = 21;
        switch (edad){
            case 18:
                System.out.println("Puedes conducir chaval");
                break;
            case 21:
                System.out.println("Puedes beber en USA chaval");
                break;
            default:
                System.out.println("Tienes la siguiente edad: "+edad);
        }
// Ejercicio 9
        System.out.println("****** Ejercicio 9 *******");
        i = 0;
        while (i<10){
            i++;
            if(i==2) {
                continue;
            }
            if(i==5) {
                break;
            }
            System.out.println("Vuelta del bucle número: "+i);
        }
    }
}

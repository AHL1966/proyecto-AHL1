package com.unisys.proyectoejemplo.ejercicios;

/*
entero llamado numero,
corto llamado marianico,
largo llamado gasol,
booleano llamado independencia,
double llamado presupuesto y
float llamado longitud.
Declara una variable llamada suma: que sea la suma de gasol y marianico, y sácala por pantalla
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        int numero;
        short marianico=10;
        long gasol= 1000;
        boolean independencia;
        double presupuesto;
        float longitud;
        int suma;
        suma = (int)gasol + marianico;
        System.out.println("Contenido de suma "+suma);
    }
}

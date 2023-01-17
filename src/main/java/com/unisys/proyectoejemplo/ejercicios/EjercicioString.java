package com.unisys.proyectoejemplo.ejercicios;

public class EjercicioString {

    public static void main(String[] args) {
        String saludo = "Hola";
        System.out.println("******** Ejercicio 5");
        System.out.println("Caracteres de saludo: "+saludo.length());
        System.out.println("******** Ejercicio 6");
        System.out.println("4 caracter de saludo: "+saludo.substring(3,4));
        System.out.println("******** Ejercicio 7");
        System.out.println("Contenido en mayúsculas de saludo: "+saludo.toUpperCase());
        System.out.println("******** Ejercicio 8");
        System.out.println("Contenido en minúsculas de saludo: "+saludo.toLowerCase());
        System.out.println("******** Ejercicio 9");
        System.out.println("Posición de l en saludo: "+saludo.indexOf("l"));
        System.out.println("******** Ejercicio 10");
        String saludo2=null;
        if(saludo.equals(saludo2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

    }
}

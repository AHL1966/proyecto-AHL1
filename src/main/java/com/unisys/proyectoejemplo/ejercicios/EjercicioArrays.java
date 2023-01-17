package com.unisys.proyectoejemplo.ejercicios;

public class EjercicioArrays {


    public static void main(String[] args) {
        int[] miArray = new int[4];
        miArray[0]=0;
        miArray[1]=1;
        miArray[2]=2;
        miArray[3]=3;
        int i;
        System.out.println("****************Ejercicio6");
        for(i=0;i<4;i++){
            System.out.println("Contenido de miArray en su posicion "+i+" es "+miArray[i]);
        }
        System.out.println("****************Ejercicio7");
        i=0;
        while(i<4){
            System.out.println("Contenido de miArray en su posicion "+i+" es "+miArray[i]);
            i++;
        }
        System.out.println("****************Ejercicio8");
        i=0;
        do{
            System.out.println("Contenido de miArray en su posicion "+i+" es "+miArray[i]);
            i++;
        }while(i<4);
        System.out.println("****************Ejercicio9");
        float[] flotantes = new float[2000];
        i=0;
        do{
            flotantes[i]=0;
            i++;
        }while(i<1000);
        flotantes[1]=7.3f;
        System.out.println("Contenido de la posicion 3 del array flotantes "+flotantes[1]);
// sdaf
        System.out.println("****************Ejercicio10");
        System.out.println("Numero de elementos del array flotantes "+flotantes.length);
    }
}
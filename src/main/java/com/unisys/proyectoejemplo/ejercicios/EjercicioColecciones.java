package com.unisys.proyectoejemplo.ejercicios;

import java.util.*;

public class EjercicioColecciones {
    public static void main(String[] args) {
        List<String> listado = new ArrayList<>();
        // Mete dos nuevos elementos en el listado
        listado.add("elemento1");
        listado.add("elemento2");
        // Imprime por pantalla el primer elemento del listado
        System.out.println(listado.get(0));
        // Recorre el listado e imprime por pantalla los elementos del listado
        for(String listauno:listado){
            System.out.println(listauno);
        }
        // Borra el último elemento de listado y comprueba que ya no existe en el listado
        listado.remove(1);
        for(String listauno:listado){
            System.out.println(listauno);
        }
        // Crea un nuevo objeto que sea un conjunto de elementos de tipo Integer (Set<Integer>) llamado numeros
        Set<Integer> numeros = new HashSet<>();
        // Mete un par de elementos dentro de conjunto de numeros
        numeros.add(18);
        numeros.add(47);
        // Recorre el conjunto de números e imprímelos por pantalla
        for(Integer listanumeros:numeros){
            System.out.println(listanumeros);
        }
        // Crea un objeto de tipo Mapa cuya clave sea un Integer y el valor sea una String
        Map<Integer, String> miMapa = new HashMap<Integer, String>();
        // Mete dos valores con sus respectivas claves en el mapa
        miMapa.put(0,"Primer valor");
        miMapa.put(1,"Segundo valor");
        // Imprime por pantalla el primer valor que has introducido
        System.out.println(miMapa.get(0));
        // Recorre el mapa e imprime los valores por pantalla
        Integer i;
        for (i=1;i<2;i++) {
            System.out.println(miMapa.get(i));
        }
        // Dentro de la función main del programa crea un objeto de la clase Serie, dos objetos de la clase Actor
        Serie serie1 = new Serie();
        List<Actor> listaActores = new ArrayList<Actor>();
        Actor actor1 = new Actor("Actor1",10,"Comico");
        Actor actor2 = new Actor("Actor2",50,"Drama");
        serie1.setGenero("Comico");
        serie1.setAnyoPublicacion(1980);
        // serie1.setReparto();
        System.out.println(actor1);
        System.out.println(actor2);
        listaActores.add(actor1);
        listaActores.add(actor2);
        serie1.setReparto(listaActores);
        System.out.println(serie1);
    }
}

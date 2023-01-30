package com.unisys.proyectoejemplo.ejercicios;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;
import java.util.Map;

public class ProgramaColecciones {
    public static void main(String[] args) {
        Pieza pieza1 = new Pieza("teclado", "periferico");
        List<Pieza> piezaList = new ArrayList<>();
        piezaList.add(pieza1);
        Ordenador ordenador1 = new Ordenador("Dell", "6400", piezaList);
        System.out.println(pieza1);
        System.out.println(ordenador1);
        System.out.println(ordenador1.getPieza());

        Ordenador nuevoOrdenador = new Ordenador();
        Pieza pieza = new Pieza();
        // List<Pieza> listadoPiezas = ordenador1.getPieza();
        // listadoPiezas.add(pieza);
        nuevoOrdenador.getPieza().add(pieza);
        // Ejercicio 15:
        Pieza pieza2 = new Pieza("raton", "periferico");
        Pieza pieza3 = new Pieza("pantalla", "periferico");
        Pieza pieza4 = new Pieza("HDDexterno", "periferico");
        Pieza pieza5 = new Pieza("ventilador", "interno");
        Pieza pieza6 = new Pieza("ventilador", "interno");
        Set<Pieza> misPiezas = new HashSet<>();
        misPiezas.add(pieza2);
        misPiezas.add(pieza3);
        misPiezas.add(pieza4);
        misPiezas.add(pieza5);
        misPiezas.add(pieza6);
        System.out.println(misPiezas);
/*        TreeSet<Pieza> piezasOrdenadas = new TreeSet<Pieza>();
        piezasOrdenadas.add(pieza2);
        piezasOrdenadas.add(pieza3);
        piezasOrdenadas.add(pieza4);
        piezasOrdenadas.add(pieza5);
        piezasOrdenadas.add(pieza6);
        System.out.println(piezasOrdenadas);
*/
        Map<String, String> nombreMap = new HashMap<String, String>();
        nombreMap.put("nombre", "Pepe");
        nombreMap.put("direccion","Pryconsa");
        nombreMap.put("tlf","649856143");
        nombreMap.put("email","pepe@gmail.com");
        System.out.println(nombreMap);
        Set<Map> listaMaps = new HashSet<>();
        listaMaps.add(nombreMap);
        Map<String, String> nombreMap2 = new HashMap<String, String>();
        nombreMap2.put("nombre", "Justo");
        nombreMap2.put("direccion","Orense");
        nombreMap2.put("tlf","666666666");
        nombreMap2.put("email","Justo@gmail.com");
        listaMaps.add(nombreMap2);
        System.out.println(listaMaps);
    }
}

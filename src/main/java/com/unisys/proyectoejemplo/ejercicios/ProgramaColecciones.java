package com.unisys.proyectoejemplo.ejercicios;

import java.util.ArrayList;
import java.util.List;

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
    }
}

package com.unisys.proyectoejemplo.ejercicios;

import java.io.Serializable;
//import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Ordenador implements Serializable {
    private static final long serialVersionUID = 1L;
    private String marca;
    private String modelo;
    private List<Pieza> pieza;

    public Ordenador() {
        this.marca = "";
        this.modelo = "";
        this.pieza = new ArrayList<Pieza>();
    }

    public Ordenador(String marca, String modelo, List<Pieza> pieza) {
        this.marca = marca;
        this.modelo = modelo;
        this.pieza = pieza;
    }

    /*
        public Ordenador() {
            this.marca = "";
            this.modelo = "";
            this.pieza = null;
        }
    */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Pieza> getPieza() {
        return pieza;
    }

    public void setPieza(List<Pieza> pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pieza=" + pieza +
                '}';
    }
}

package com.unisys.proyectoejemplo.ejercicios;

import java.io.Serializable;

public class Pieza implements Serializable {
    private static final long serialVersionUID = 11L;
    private String nombre;
    private String tipoPieza;

    public Pieza(String nombre, String tipoPieza) {
        this.nombre = nombre;
        this.tipoPieza = tipoPieza;
    }
    public Pieza() {
        this.nombre = "";
        this.tipoPieza = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(String tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "nombre='" + nombre + '\'' +
                ", tipoPieza='" + tipoPieza + '\'' +
                '}';
    }
}

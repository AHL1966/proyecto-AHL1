package com.unisys.proyectoejemplo.ejercicios;

import java.security.NoSuchAlgorithmException;

public class Casa {
    private String direccion;
    private Integer metrosCuadrados;

    public Casa(String direccion, Integer metrosCuadrados) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}

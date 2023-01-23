package com.unisys.proyectoejemplo.ejercicios;

import lombok.Data;

@Data
public class Piso extends Casa{
    private Integer planta;

    public Piso(String direccion, Integer metrosCuadrados, Integer planta) {
        super(direccion, metrosCuadrados);
        this.planta = planta;
    }

    @Override
    public String toString() {
        return "Piso{" +
                "direccion='" + this.getDireccion() + '\'' +
                ", metrosCuadrados=" + this.getMetrosCuadrados()+ '\'' +
                "planta=" + planta +
                '}';
    }
}

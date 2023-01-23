package com.unisys.proyectoejemplo.ejercicios;

import lombok.Data;

@Data
public class Chalet extends Casa{
    private Integer plantas;

    public Chalet(String direccion, Integer metrosCuadrados, Integer plantas) {
        super(direccion, metrosCuadrados);
        this.plantas = plantas;
    }

    @Override
    public String toString() {
        return "Chalet{" +
                "direccion='" + this.getDireccion() + '\'' +
                ", metrosCuadrados=" + this.getMetrosCuadrados()+ '\'' +
                "plantas=" + plantas +
                '}';
    }
}

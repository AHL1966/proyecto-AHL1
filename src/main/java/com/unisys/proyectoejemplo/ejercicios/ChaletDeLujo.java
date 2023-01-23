package com.unisys.proyectoejemplo.ejercicios;

import lombok.Data;

@Data

public class ChaletDeLujo extends Chalet{
    private Integer numeroBagnos;

    public ChaletDeLujo(String direccion, Integer metrosCuadrados, Integer plantas, Integer numeroBagnos) {
        super(direccion, metrosCuadrados, plantas);
        this.numeroBagnos = numeroBagnos;
    }

    @Override
    public String toString() {
        return "ChaletDeLujo{" +
                "direccion='" + this.getDireccion() + '\'' +
                ", metrosCuadrados=" + this.getMetrosCuadrados()+ '\'' +
                ", plantas=" + this.getPlantas()+ '\'' +
                ", numeroBagnos=" + numeroBagnos +
                '}';
    }
}

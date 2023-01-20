package com.unisys.proyectoejemplo.ejercicios;

import java.util.Objects;

public class Jefe extends Empleado{
    public String nivelJefe;

    public Jefe(String apellido, Integer edad, String nombre, String dni, String tlf, Integer sueldo, String cargo, String nivelJefe) {
        super(apellido, edad, nombre, dni, tlf, sueldo, cargo);
        this.nivelJefe = nivelJefe;
    }

    public String getNivelJefe() {
        return nivelJefe;
    }

    public void setNivelJefe(String nivelJefe) {
        this.nivelJefe = nivelJefe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jefe jefe = (Jefe) o;
        return Objects.equals(nivelJefe, jefe.nivelJefe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nivelJefe);
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "nivelJefe='" + nivelJefe + '\'' +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                '}';
    }
}

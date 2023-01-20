package com.unisys.proyectoejemplo.ejercicios;

import java.util.Objects;

public class Currito extends Empleado{
    public String nivelCurrito;

    public Currito(String apellido, Integer edad, String nombre, String dni, String tlf, Integer sueldo, String cargo, String nivelCurrito) {
        super(apellido, edad, nombre, dni, tlf, sueldo, cargo);
        this.nivelCurrito = nivelCurrito;
    }

    public String getNivelCurrito() {
        return nivelCurrito;
    }

    public void setNivelCurrito(String nivelCurrito) {
        this.nivelCurrito = nivelCurrito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currito currito = (Currito) o;
        return Objects.equals(nivelCurrito, currito.nivelCurrito);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nivelCurrito);
    }

    @Override
    public String toString() {
        return "Currito{" +
                "nivelCurrito='" + nivelCurrito + '\'' +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                '}';
    }
}

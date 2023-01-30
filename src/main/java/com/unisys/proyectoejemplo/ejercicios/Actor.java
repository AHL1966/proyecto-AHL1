package com.unisys.proyectoejemplo.ejercicios;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable {
    // El actor debe tener una serie de propiedades: nombre, años de experiencia, género favorito
    // Mete los constructores con y sin parámetros, los getter y setter, el toString y el equals y hascode
    private static final long serialUID = 12L;
    private String nombre;
    private Integer anyosExperiencia;
    private String generoFavorito;

    public Actor(String nombre, Integer anyosExperiencia, String generoFavorito) {
        this.nombre = nombre;
        this.anyosExperiencia = anyosExperiencia;
        this.generoFavorito = generoFavorito;
    }
    public Actor() {
        this.nombre = "";
        this.anyosExperiencia = 0;
        this.generoFavorito = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(Integer anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public String getGeneroFavorito() {
        return generoFavorito;
    }

    public void setGeneroFavorito(String generoFavorito) {
        this.generoFavorito = generoFavorito;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", anyosExperiencia=" + anyosExperiencia +
                ", generoFavorito='" + generoFavorito + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(nombre, actor.nombre) && Objects.equals(anyosExperiencia, actor.anyosExperiencia) && Objects.equals(generoFavorito, actor.generoFavorito);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anyosExperiencia, generoFavorito);
    }
}

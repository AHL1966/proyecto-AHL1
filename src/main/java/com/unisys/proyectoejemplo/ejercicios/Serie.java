package com.unisys.proyectoejemplo.ejercicios;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
import java.util.*;
@NoArgsConstructor
public class Serie implements Serializable {
    // Crea una nueva clase llamada Serie
    // La clase debe disponer de un título, un género y un año de publicación
    // Mete los constructores con y sin parámetros, los getter y setter, el toString y el equals y hascode
    private static final long serialUID = 11L;
    private String titulo;
    private String genero;
    private Integer anyoPublicacion;
    List<Actor> reparto= new ArrayList<>();

    public Serie(String titulo, String genero, Integer anyoPublicacion, List<Actor> reparto) {
        this.titulo = titulo;
        this.genero = genero;
        this.anyoPublicacion = anyoPublicacion;
        this.reparto = reparto;
    }

    public List<Actor> getReparto() {
        return reparto;
    }

    public void setReparto(List<Actor> reparto) {
        this.reparto = reparto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(Integer anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anyoPublicacion=" + anyoPublicacion +
                ", reparto=" + reparto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(titulo, serie.titulo) && Objects.equals(genero, serie.genero) && Objects.equals(anyoPublicacion, serie.anyoPublicacion) && Objects.equals(reparto, serie.reparto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero, anyoPublicacion, reparto);
    }
}

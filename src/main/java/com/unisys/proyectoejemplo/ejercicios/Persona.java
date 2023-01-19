package com.unisys.proyectoejemplo.ejercicios;

public class Persona {
    public String apellido;
    public Integer edad;
    public String nombre;
    public String dni;
    public String tlf;

    public Persona(String apellido, Integer edad, String nombre, String dni, String tlf) {
        apellido = apellido;
        edad = edad;
        nombre = nombre;
        dni = dni;
        tlf = tlf;
    }

    public Persona() {
        apellido = "";
        edad = 0;
        nombre = "";
        dni = "";
        tlf = "";
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTlf() {
        return tlf;
    }

    public void setApellido(String apellido) {
        apellido = apellido;
    }

    public void setEdad(Integer edad) {
        edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

}

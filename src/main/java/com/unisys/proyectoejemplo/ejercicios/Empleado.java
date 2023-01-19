package com.unisys.proyectoejemplo.ejercicios;

public class Empleado extends Persona{
    public Integer sueldo;
    public String cargo;

    public Empleado() {
        super();
        this.sueldo = 0;
        this.cargo = "";
    }
/*
    public Empleado(Integer sueldo, String cargo) {
        super();
        this.sueldo = sueldo;
        this.cargo = cargo;
    }
*/
    public Empleado(String apellido, Integer edad, String nombre, String dni, String tlf,Integer sueldo, String cargo ){
        super(apellido, edad, nombre, dni,tlf);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

/*    public Empleado(Persona persona, Integer sueldo, String cargo){
        super(persona.getApellido(), persona.getEdad(), persona.getNombre(),persona.getDni(), persona.getTlf());
        this.sueldo = sueldo;
        this.cargo = cargo;
    }
*/
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

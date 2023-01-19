package com.unisys.proyectoejemplo.ejercicios;

import java.sql.SQLOutput;

public class ProgramaEmpleados {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Hernandez",57,"Alfonso", "456123877X", "650456781", 100000, "Programador");
        empleado1.setApellido("Lopez");
        empleado1.setEdad(20);
        empleado1.setNombre("Antonio");
        empleado1.setDni("123456789V");
        empleado1.setTlf("649856140");
        empleado1.setSueldo(50000);
        empleado1.setCargo("Analista");
        System.out.println("emleado2: "+empleado2.getNombre());
        System.out.println("emleado2: "+empleado2.getDni());
        System.out.println("emleado2: "+empleado2.getTlf());
        System.out.println("emleado2: "+empleado2.getSueldo());
        System.out.println("emleado2: "+empleado2.getCargo());
        System.out.println("emleado2: "+empleado2.getEdad());
        System.out.println("emleado2: "+empleado2.getApellido());
        //
        System.out.println("emleado1: "+empleado1.getNombre());
        System.out.println("emleado1: "+empleado1.getDni());
        System.out.println("emleado1: "+empleado1.getTlf());
        System.out.println("emleado1: "+empleado1.getSueldo());
        System.out.println("emleado1: "+empleado1.getCargo());
        System.out.println("emleado1: "+empleado1.getEdad());
        System.out.println("emleado1: "+empleado1.getApellido());

    }
}

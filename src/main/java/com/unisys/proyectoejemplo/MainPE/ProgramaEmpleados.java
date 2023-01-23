package com.unisys.proyectoejemplo.MainPE;

import com.unisys.proyectoejemplo.ejercicios.Currito;
import com.unisys.proyectoejemplo.ejercicios.Empleado;
import com.unisys.proyectoejemplo.ejercicios.Jefe;

public class ProgramaEmpleados {
    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Hernandez",57,"Alfonso", "456123877X", "650456781", 100000, "Programador");
        Jefe jefe1 = new Jefe("Perez",65,"Juan", "65554877X", "650545581", 200000, "Manager", "Subdirector");
        Currito currito1 = new Currito("Perez",65,"Juan", "65554877X", "650545581", 200000, "Manager", "Secretario");
/*        empleado1.setApellido("Lopez");
        empleado1.setEdad(20);
        empleado1.setNombre("Antonio");
        empleado1.setDni("123456789V");
        empleado1.setTlf("649856140");
        empleado1.setSueldo(50000);
        empleado1.setCargo("Analista");
*/
        System.out.println("***************");
        System.out.println("emleado2: "+empleado2.toString());
        System.out.println("***************");
        System.out.println("jefe1: "+jefe1.toString());
        System.out.println("***************");
        System.out.println("currito1: "+currito1.toString());
        //
        currito1.setNivelCurrito("Secretario de Dirección");
        System.out.println("***************");
        System.out.println("currito1: "+currito1.toString());
        //
        jefe1.setNivelJefe("Director");
        System.out.println("***************");
        System.out.println("jefe1: "+jefe1.toString());
        //
        empleado2.setNombre("Alberto");
        System.out.println("emleado2: "+empleado2.toString());
        System.out.println("emleado2: "+empleado2.getNombre());
        //
        jefe1.setSueldo(999999); // tengo acceso al sueldo aunque sea protected
        jefe1.sueldo = 888888; // tengo acceso al sueldo aunque sea protected
        System.out.println("jefe1: "+jefe1.toString());
        System.out.println("jefe1: "+jefe1.getSueldo());
        //
        currito1.setSueldo(999999); // tengo acceso al sueldo aunque sea protected
        currito1.sueldo = 888888; // tengo acceso al sueldo aunque sea protected
        System.out.println("jefe1: "+currito1.toString());
        System.out.println("jefe1: "+currito1.getSueldo());

    }
}

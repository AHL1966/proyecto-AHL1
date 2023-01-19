package com.unisys.proyectoejemplo.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatoLombok {
    private String name;
    private int age;
    private Date fechaNacimiento;
}

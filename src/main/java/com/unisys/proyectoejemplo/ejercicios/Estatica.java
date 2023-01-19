package com.unisys.proyectoejemplo.ejercicios;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Estatica {
    private final String PI="3.141592653589793";
    static String berrinche;
    public static String Berrinche(){
        return berrinche;
    }

}

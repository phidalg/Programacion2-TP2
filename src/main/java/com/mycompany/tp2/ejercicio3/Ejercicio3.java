package com.mycompany.tp2.ejercicio3;

import com.mycompany.tp2.util.Input;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio3 {
    private static final String NINO = "Niño";
    private static final String ADOLESCENTE = "Adolescente";
    private static final String ADULTO = "Adulto";
    private static final String ADULTO_MAYOR = "Adulto mayor";
    
    public static void clasificacionEdad() {
        Input input = new Input();
        
        int edad = input.getValidatedInputInt("Ingrese su edad:", true, false, true);
        
        String clasificacion;
        
        if (edad < 12) {
            clasificacion = NINO;
        } else if (edad >= 12 && edad <= 17) {
            clasificacion = ADOLESCENTE;
        } else if (edad >= 18 && edad <= 59) {
            clasificacion = ADULTO;
        } else {
            clasificacion = ADULTO_MAYOR;
        }
        
        System.out.println("Eres un " + clasificacion + ".");
    }
}

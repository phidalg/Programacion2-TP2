package com.mycompany.tp2.ejercicio7;

import com.mycompany.tp2.util.Input;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio7 {
    
    private static final int NOTA_MAX = 10;
    private static final int NOTA_MIN = 0;
    
    public static void validarNota() {
        Input input = new Input();
        int nota;
        
        nota = input.getValidatedInputIntRange(
                "Ingrese una nota entre " + NOTA_MIN + " y " + NOTA_MAX + ":",
                NOTA_MIN,
                NOTA_MAX,
                "Nota inválida. Ingrese una nota entre "  + NOTA_MIN + " y " + NOTA_MAX + ":");
        System.out.println("Nota guardada correctamente.");
    }
    
}

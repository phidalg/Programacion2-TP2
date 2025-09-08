package com.mycompany.tp2.ejercicio1;

import com.mycompany.tp2.util.Input;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio1 {
    
    public static void esBiciesto() {
        Input input = new Input();
        int year;
        year = input.getValidatedInputInt("Ingrese un año:", true, false, false);
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("El año " + year + " es biciesto.");
        } else {
            System.out.println("El año " + year + " no es biciesto.");
        }
    }
    
}

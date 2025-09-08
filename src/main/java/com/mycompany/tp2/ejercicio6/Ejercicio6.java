package com.mycompany.tp2.ejercicio6;

import com.mycompany.tp2.util.Input;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio6 {
    
    private static final int TOTAL_NUMEROS = 10;
    
    public static void contadorNumeros() {
        Input input = new Input();
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            int numero = input.getValidatedInputInt("Ingrese el número " + i + " de " + TOTAL_NUMEROS +":", true, true, true);
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("Resultados:");
        System.out.println(" Positivos:\t" + positivos);
        System.out.println(" Negativos:\t" + negativos);
        System.out.println(" Ceros:\t\t" + ceros);
    }
}

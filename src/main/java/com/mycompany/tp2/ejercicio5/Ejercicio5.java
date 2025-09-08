package com.mycompany.tp2.ejercicio5;

import com.mycompany.tp2.util.Input;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio5 {
    
    private static final int NUMERO_SALIDA = 0;
    
    public static void sumaNumerosPares() {
        Input input = new Input();
        
        int numero;
        int sumaPares = 0;
        
        while (true) {
            numero = input.getValidatedInputInt("Ingrese un número (0 para terminar):", true, true, true);
            
            if (numero == NUMERO_SALIDA) {
                break;
            }
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
        }
        
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
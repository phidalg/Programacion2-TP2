package com.mycompany.tp2.ejercicio2;

import com.mycompany.tp2.util.Input;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio2 {
    
    public static void mayorDeTresNumeros() {
        Input input = new Input();
        int numero1 = input.getValidatedInputInt("Ingrese el primer número:", true, true, true);
        int numero2 = input.getValidatedInputInt("Ingrese el segundo número:", true, true, true);
        int numero3 = input.getValidatedInputInt("Ingrese el tercer número:", true, true, true);
        
        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        
        System.out.println("El mayor es: " + mayor);
    }
}

package com.mycompany.tp2.ejercicio10;

import com.mycompany.tp2.util.Input;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio10 {
    
    public static void actualizarStock() {
        Input input = new Input();
        
        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;
        
        stockActual = input.getValidatedInputInt("Ingrese el stock actual del producto:", true, false, true);
        cantidadVendida = input.getValidatedInputInt("Ingrese la cantidad vendida:", true, false, true);
        cantidadRecibida = input.getValidatedInputInt("Ingrese la cantidad recibida:", true, false, true);
        
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    private static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
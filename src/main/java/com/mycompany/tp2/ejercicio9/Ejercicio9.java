package com.mycompany.tp2.ejercicio9;

import com.mycompany.tp2.util.Input;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio9 {
    
    private static final String ZONA_NACIONAL = "Nacional";
    private static final String ZONA_INTERNACIONAL = "Internacional";
    private static final double TARIFA_NACIONAL = 5.0;
    private static final double TARIFA_INTERNACIONAL = 10.0;
    
    public static void calcularCostoEnvioYTotal() {
        Input input = new Input();
        
        String[] zonasValidas = {ZONA_NACIONAL, ZONA_INTERNACIONAL};
        
        double precioProducto, peso, costoEnvio, totalCompra;
        String zona;
        
        precioProducto = input.getValidatedInputDouble("Ingrese el precio del producto:", true, false, false);
        peso = input.getValidatedInputDouble("Ingrese el peso del paquete en kg:", true, false, false);
        zona = input.getValidatedInputString("Ingrese la zona de envío (Nacional/Internacional):", zonasValidas);
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
    }
    
    private static double calcularCostoEnvio(double peso, String zona) {
        double tarifa;
        
        if (zona.equalsIgnoreCase(ZONA_NACIONAL)) {
            tarifa = TARIFA_NACIONAL;
        } else {
            tarifa = TARIFA_INTERNACIONAL;
        }
        
        return peso * tarifa;
    }
    
    private static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
}
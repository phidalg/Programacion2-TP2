package com.mycompany.tp2.ejercicio8;

import com.mycompany.tp2.util.Input;

/**
 * 
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio8 {
    
    public static void calcularPrecioConImpuestoYDescuento() {
        Input input = new Input();
        
        double precioBase, impuesto, descuento, precioFinal, impuestoDecimal, descuentoDecimal;
        
        precioBase = input.getValidatedInputInt("Ingrese el precio base del producto:", true, false, false);
        impuesto = input.getValidatedInputInt("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):", true, false, true);
        descuento = input.getValidatedInputInt("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):", true, false, true);
        
        impuestoDecimal = impuesto / 100.0;
        descuentoDecimal = descuento / 100.0;
        
        precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        
        System.out.println("El precio final del producto es: " + precioFinal);
    }
    
}
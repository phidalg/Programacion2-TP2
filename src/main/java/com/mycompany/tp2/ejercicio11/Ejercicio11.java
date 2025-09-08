package com.mycompany.tp2.ejercicio11;

import com.mycompany.tp2.util.Input;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio11 {
    
    private static final double descuento_especial = 0.10;
    
    public static void descuentoEspecial() {
        Input input = new Input();
        
        double precio;
        
        precio = input.getValidatedInputDouble("Ingrese el precio del producto:", true, false, false);
        
        calcularDescuentoEspecial(precio);
    }
    
    private static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuento_especial;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println(" El descuento especial aplicado es:\t$" + descuentoAplicado);
        System.out.println(" El precio final con descuento es:\t$" + precioFinal);
    }
}
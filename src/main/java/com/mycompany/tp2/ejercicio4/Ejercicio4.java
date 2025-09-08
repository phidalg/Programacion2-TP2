package com.mycompany.tp2.ejercicio4;

import com.mycompany.tp2.util.Input;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio4 {
    
    private static final String CATEGORIA_A = "A";
    private static final String CATEGORIA_B = "B";
    private static final String CATEGORIA_C = "C";
    private static final double DESCUENTO_A = 0.10;
    private static final double DESCUENTO_B = 0.15;
    private static final double DESCUENTO_C = 0.20;
    
    public static void calculadoraDescuento() {
        Input input = new Input();
        
        double precio, montoDescuento, precioFinal, porcentajeDescuento;
        String[] categoriasValidas = {CATEGORIA_A, CATEGORIA_B, CATEGORIA_C};
        String categoria;
        
        precio = input.getValidatedInputInt("Ingrese el precio del producto:", true, false, false);
        
        categoria = input.getValidatedInputString("Ingrese la categoría del producto (A, B o C):", categoriasValidas);
        
        switch (categoria.toUpperCase()) {
            case CATEGORIA_A:
                porcentajeDescuento = DESCUENTO_A;
                break;
            case CATEGORIA_B:
                porcentajeDescuento = DESCUENTO_B;
                break;
            case CATEGORIA_C:
                porcentajeDescuento = DESCUENTO_C;
                break;
            default:
                porcentajeDescuento = 0;
                break;
        }
        
        montoDescuento = precio * porcentajeDescuento;
        precioFinal = precio - montoDescuento;
        
        System.out.println(" Precio original:\t" + "$ " + precio);
        System.out.println(" Descuento aplicado:\t" + (int)(porcentajeDescuento * 100) + "%");
        System.out.println(" Precio final:\t\t" + "$ " + precioFinal);
    }
}
package com.mycompany.tp2.ejercicio12;

import com.mycompany.tp2.util.Input;
import com.mycompany.tp2.util.Util;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio12 {
    
    private static final String[] PRODUCTOS = {"Banana", "Manzana", "Naranja", "Limon", "Uvas", "Pera"};
    private static final int[] PRECIOS_ORIGINALES = {2500, 1200, 1500, 1750, 4950, 3000};
    private static final int CANTIDAD_PRODUCTOS = 6;
    
    public static void modificarPrecio() {
        
        Input input = new Input();
        int[] preciosNuevos = new int[CANTIDAD_PRODUCTOS];
        System.arraycopy(PRECIOS_ORIGINALES, 0, preciosNuevos, 0, PRECIOS_ORIGINALES.length);
        String productoModificado;
        int numeroDeProducto, nuevoPrecio;
        
        System.out.println("\nLista de precios original:");
        imprimirLista(PRODUCTOS, PRECIOS_ORIGINALES);
        
        productoModificado = input.getValidatedInputString("\nIngrese el producto a modificar:", PRODUCTOS);
        productoModificado = Util.capitalizeFirstLetter(productoModificado);
        switch (productoModificado) {
            case "Banana":
                numeroDeProducto = 0;
                break;
            case "Manzana":
                numeroDeProducto = 1;
                break;
            case "Naranja":
                numeroDeProducto = 2;
                break;
            case "Limon":
                numeroDeProducto = 3;
                break;
            case "Uvas":
                numeroDeProducto = 4;
                break;
            case "Pera":
                numeroDeProducto = 5;
                break;
            default:
                throw new AssertionError();
        }
        
        nuevoPrecio = input.getValidatedInputInt(
                "\nIngrese el nuevo precio para el producto " + productoModificado + " :",
                true, false, true);
        
        preciosNuevos[numeroDeProducto] = nuevoPrecio;
        
        System.out.println("\nNueva lista de precios:");
        imprimirLista(PRODUCTOS, preciosNuevos);
        }
    
    private static void imprimirLista(String[] productos, int[] precios) {
        for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
            System.out.println(" " + productos[i] + ":  \t$ " + precios[i]);
        }
    }
    

}

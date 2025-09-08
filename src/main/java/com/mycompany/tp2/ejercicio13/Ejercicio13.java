package com.mycompany.tp2.ejercicio13;

import com.mycompany.tp2.util.Input;
import com.mycompany.tp2.util.Util;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Ejercicio13 {
    
    private static final String[] QUESOS = {
        "Sardo  ", 
        "Holanda", 
        "Cremoso", 
        "Savorizado", 
        "Tybo   ", 
        "Regional"};
    
    private static final double[] PRECIOS_ORIGINALES = {
        15500.00,
        18000.00,
        12000.00,
        18000.00,
        15500.00,
         9500.00};
    
    private static final int CANTIDAD_PRODUCTOS = 6;
    
    public static void modificarPrecioRecursivo() {
        
        Input input = new Input();
        double[] preciosNuevos = new double[CANTIDAD_PRODUCTOS];
        System.arraycopy(PRECIOS_ORIGINALES, 0, preciosNuevos, 0, PRECIOS_ORIGINALES.length);
        String productoModificado;
        int numeroDeProducto;
        double nuevoPrecio;
        
        System.out.println("\nLista de precios original:");
        imprimirListaRecursiva(QUESOS, PRECIOS_ORIGINALES, 0);
        
        productoModificado = input.getValidatedInputString("\nIngrese el producto a modificar:", QUESOS);
        productoModificado = Util.capitalizeFirstLetter(productoModificado);
        
        switch (productoModificado) {
            case "Sardo":
                numeroDeProducto = 0;
                break;
            case "Holanda":
                numeroDeProducto = 1;
                break;
            case "Cremoso":
                numeroDeProducto = 2;
                break;
            case "Savorizado":
                numeroDeProducto = 3;
                break;
            case "Tybo":
                numeroDeProducto = 4;
                break;
            case "Regional":
                numeroDeProducto = 5;                
                break;
            default:
                throw new AssertionError();
        }
        
        nuevoPrecio = input.getValidatedInputDouble(
                "\nIngrese el nuevo precio para el producto Queso " + productoModificado + " :",
                true, false, true);
        
        preciosNuevos[numeroDeProducto] = nuevoPrecio;
        
        System.out.println("\nNueva lista de precios:");
        imprimirListaRecursiva(QUESOS, preciosNuevos, 0);

    }
    
    private static void imprimirListaRecursiva(String[] listaProductos, double[] listaPrecios, int elemento) {
        System.out.println(" Queso " + listaProductos[elemento] + " \t $ " + listaPrecios[elemento]);
        if(elemento < listaProductos.length - 1) {
            imprimirListaRecursiva(listaProductos, listaPrecios, elemento + 1);
        }
    }
    
    

}

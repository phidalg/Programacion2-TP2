package com.mycompany.tp2.util;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Util {
    
    /**
     * Capitaliza la primera letra de un string, manteniendo el resto del texto
     * en su formato original. El método elimina espacios en blanco al inicio
     * y final del string antes de procesar.
     * 
     * @param str el string a procesar
     * @return string con la primera letra en mayúscula y el resto sin cambios,
     *         o string vacío si la entrada es null o vacía después del trim
     * @throws StringIndexOutOfBoundsException si el string está vacío después del trim
     */
    public static String capitalizeFirstLetter(String str) {
        String primerLetra, ultimasLetras;
        str = str.trim();
        primerLetra = str.substring(0, 1);
        primerLetra = primerLetra.toUpperCase();
        ultimasLetras = str.substring(1);
        return primerLetra + ultimasLetras;
    }

}

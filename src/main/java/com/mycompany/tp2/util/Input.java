package com.mycompany.tp2.util;

import java.util.Scanner;

/**
 *
 * @author Pedro Hidalgo
 */
public class Input {
    
    Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }
    
    /**
     * Obtiene un string del usuario sin validaciones adicionales
     * @param prompt mensaje a mostrar al usuario
     * @return string ingresado por el usuario
     */
    public String getValidatedInputString(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine().trim();
    }
    
    /**
     * Obtiene un string del usuario y valida que coincida con una de las opciones válidas
     * @param prompt mensaje a mostrar al usuario
     * @param validOptions arreglo de strings válidos
     * @return string validado que coincide con una de las opciones
     */
    public String getValidatedInputString(String prompt, String[] validOptions) {
        boolean isValidInput = false;
        String input;
        do {
            System.out.print(prompt + " ");
            input = scanner.nextLine().trim();
            
            // Verificar si el input coincide con alguna opción válida (case insensitive)
            for (String option : validOptions) {
                String trimmedOption = option.trim();
                if (input.equalsIgnoreCase(trimmedOption)) {
                    isValidInput = true;
                    break;
                }
            }
            
            if (!isValidInput) {
                System.out.println("Error: Entrada inválida. Las opciones válidas son:");
                for (int i = 0; i < validOptions.length; i++) {
                    if (i == validOptions.length - 1) {
                        System.out.println(validOptions[i].trim());
                    } else {
                        System.out.print(validOptions[i].trim() + ", ");
                    }
                }
            }
        } while (!isValidInput);
        return input;
    }
    
    /**
     * Obtiene un número entero validado del usuario según los criterios especificados
     * @param prompt mensaje a mostrar al usuario
     * @param canBePositive si se permiten números positivos (mayor que 0)
     * @param canBeNegative si se permiten números negativos (menor que 0)
     * @param canBeZero si se permite el número cero
     * @return número entero validado que cumple con los criterios especificados
     */
    public int getValidatedInputInt(String prompt, boolean canBePositive, boolean canBeNegative, boolean canBeZero) {
        boolean isValidInput = false;
        int input = 0;
        do {
            System.out.print(prompt + " ");
            try {
                String inputStr = scanner.nextLine().trim();
                input = Integer.parseInt(inputStr);
                
                if (input > 0 && canBePositive) {
                    isValidInput = true;
                } else if (input < 0 && canBeNegative) {
                    isValidInput = true;
                } else if (input == 0 && canBeZero) {
                    isValidInput = true;
                } else {
                    System.out.println("El número no cumple con los criterios requeridos.");
                    isValidInput = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                isValidInput = false;
            }
        } while (!isValidInput);
        return input;
    }
    
    /**
     * Solicita al usuario que ingrese un número y valida que esté dentro 
     * del rango especificado (inclusive). Si el número no está en el rango 
     * o no es un entero válido, muestra un mensaje de error y solicita 
     * nuevamente la entrada.
     * 
     * @param prompt mensaje a mostrar al usuario para solicitar la entrada
     * @param min valor mínimo permitido (inclusive)
     * @param max valor máximo permitido (inclusive)
     * @param error mensaje de error a mostrar cuando el número está fuera del rango
     * @return número entero validado que está dentro del rango especificado
     */
    public int getValidatedInputIntRange(String prompt, int min, int max, String error) {
        boolean isValidInput = false;
        int input = 0;
        do {
            System.out.print(prompt + " ");
            try {
                String inputStr = scanner.nextLine().trim();
                input = Integer.parseInt(inputStr);
                
                if ((input >= min) && (input <= max)) {
                    isValidInput = true;
                } else {
                    System.out.println(error);
                    isValidInput = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                isValidInput = false;
            }
        } while (!isValidInput);
        return input;
    }
    
    /**
     * Obtiene un número decimal validado del usuario según los criterios especificados
     * @param prompt mensaje a mostrar al usuario
     * @param canBePositive si se permiten números positivos (mayor que 0)
     * @param canBeNegative si se permiten números negativos (menor que 0)
     * @param canBeZero si se permite el número cero
     * @return número decimal validado que cumple con los criterios especificados
     */
    public double getValidatedInputDouble(String prompt, boolean canBePositive, boolean canBeNegative, boolean canBeZero) {
        boolean isValidInput = false;
        double input = 0;
        do {
            System.out.print(prompt + " ");
            try {
                String inputStr = scanner.nextLine().trim();
                input = Double.parseDouble(inputStr);
                
                if (input > 0 && canBePositive) {
                    isValidInput = true;
                } else if (input < 0 && canBeNegative) {
                    isValidInput = true;
                } else if (input == 0 && canBeZero) {
                    isValidInput = true;
                } else {
                    System.out.println("El número no cumple con los criterios requeridos.");
                    isValidInput = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                isValidInput = false;
            }
        } while (!isValidInput);
        return input;
    }
    
    /**
     * Solicita al usuario que ingrese un número y valida que esté
     * dentro del rango especificado (inclusive). Si el número no está en el rango
     * o no es un decimal válido, muestra un mensaje de error y solicita nuevamente
     * la entrada.
     * 
     * @param prompt mensaje a mostrar al usuario para solicitar la entrada
     * @param min valor mínimo permitido (inclusive)
     * @param max valor máximo permitido (inclusive)
     * @param error mensaje de error personalizado a mostrar cuando el número está fuera del rango
     * @return número decimal validado que está dentro del rango especificado
     */
    public double getValidatedInputDoubleRange(String prompt, double min, double max, String error) {
        boolean isValidInput = false;
        double input = 0;
        do {
            System.out.print(prompt + " ");
            try {
                String inputStr = scanner.nextLine().trim();
                input = Double.parseDouble(inputStr);
                
                if ((input >= min) && (input <= max)) {
                    isValidInput = true;
                } else {
                    System.out.println(error);
                    isValidInput = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número.");
                isValidInput = false;
            }
        } while (!isValidInput);
        return input;
    }
    
}

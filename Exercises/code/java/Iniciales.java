
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iniciales;

import java.util.Scanner;

/**
 *
 * @author herrn
 */
public class Iniciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir el nombre y apellidos
        try (Scanner scanner = new Scanner(System.in)) {
            // Pedir el nombre y apellidos
            System.out.print("Ingrese su primer nombre: ");
            String nombre1 = scanner.next();
            
            System.out.print("Ingrese su segundo nombre: ");
            String nombre2 = scanner.next();
            
            System.out.print("Ingrese su primer apellido: ");
            String apellido1 = scanner.next();
            
            System.out.print("Ingrese su segundo apellido: ");
            String apellido2 = scanner.next();
            
            // Obtener y mostrar iniciales con formato "."
            String iniciales = nombre1.charAt(0) + "." + nombre2.charAt(0) + "." + apellido1.charAt(0) + "." + apellido2.charAt(0) + ".";
            System.out.println("Sus iniciales son: " + iniciales.toUpperCase());
        }
    }
}

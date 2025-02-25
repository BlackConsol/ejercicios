
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacionfinal;

import java.util.Scanner;

/**
 *
 * @author herrn
 */
public class CalificacionFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir los promedios de cada corte
        try (Scanner scanner = new Scanner(System.in)) {
            // Pedir los promedios de cada corte
            System.out.print("Ingrese el promedio del primer corte: ");
            float primerCorte = scanner.nextFloat();
            
            System.out.print("Ingrese el promedio del segundo corte: ");
            float segundoCorte = scanner.nextFloat();
            
            System.out.print("Ingrese el promedio del tercer corte: ");
            float tercerCorte = scanner.nextFloat();
            
            // Calcular la calificación final
            float calificacionFinal = (primerCorte * 0.30f) + (segundoCorte * 0.30f) + (tercerCorte * 0.40f);
            
            // Mostrar el resultado
            System.out.println("Su calificación final es: " + calificacionFinal);
        }
    }
}

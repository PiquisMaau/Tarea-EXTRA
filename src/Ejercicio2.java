import java.util.Scanner;

/*Ejercicio basado en el ejercicio 7.2 del Libro Fundamentos de Programacion
 * Se ingresan N edades de personas. 
 * Escribir un algoritmo que permita calcular la edad promedio
 *  y determinar entre todas ellas cuáles son mayores o iguales a esa edad promedio,\
 *  tambien imprimir la sumatoria.
 */
public class Ejercicio2 {
    public static void LecturaeImpresion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de edades: ");
        int CantidadEdades = scanner.nextInt();

        int[] edades = new int[CantidadEdades];
        int suma = 0;

        System.out.println("Ingrese las edades:");
        for (int i = 0; i < CantidadEdades; i++) {
            edades[i] = scanner.nextInt();
            suma += edades[i];
        }

        System.out.println("\nLa Edad promedio es: " + Calcularpromedio(suma, CantidadEdades));
        System.out.println("La sumatoria de edades es: " + suma);
        System.out.println("\nEdades mayores o iguales al promedio:");
        for (int edad : edades) {
            if (edad >= Calcularpromedio(suma, CantidadEdades)) {
                System.out.println(edad);
            }
        }
    }

    public static double Calcularpromedio(int suma, int CantidadEdades) {
        double promedio = suma / CantidadEdades;
        return promedio;
    }

    public static void main(String[] args) {

        LecturaeImpresion();

    }
}

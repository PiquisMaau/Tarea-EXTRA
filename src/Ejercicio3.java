import java.util.Scanner;

/*Ejercicio basado en el ejercicio 7.3 del Libro Fundamentos de Programacion
 * Escribir un algoritmo que permita contar el número de elementos
 *  pares e impares de una tabla, la longitud y valores de la tabla se piden al usuario.
 */

public class Ejercicio3 {

    public static void LecturaeImpresion() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la tabla: ");
        int n = teclado.nextInt();
        int[] tabla = new int[n];

        System.out.println("Ingrese los valores de la tabla:");
        for (int i = 0; i < n; i++) {
            tabla[i] = teclado.nextInt();
        }
        ContarParesImpares(tabla);

    }

    public static void ContarParesImpares(int[] tabla_) {
        int pares = 0, impares = 0;

        for (int valores : tabla_) {
            if (valores % 2 == 0) {
                pares++;
            } else {
                impares++;

            }
        }
        System.out.println("\nNúmero de elementos pares: " + pares);
        System.out.println("Número de elementos impares: " + impares);

    }

    public static void main(String[] args) {
        LecturaeImpresion();
    }
}

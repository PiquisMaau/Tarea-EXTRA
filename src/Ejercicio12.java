import java.util.Scanner;

public class Ejercicio12 {
    /*
     * Ejercicio basado en el ejercicio 81, del libro de Fundamentos de Programación
     * del Ing.Marcelo Villalobos
     * Dado una matriz de 5x4, busca un número ingresado por el usuario
     * y determina si existe en la matriz y en qué posición se encuentra.
     * Utiliza el método de búsqueda secuencial.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas = 5, columnas = 4;
        int[][] matriz = new int[filas][columnas];
        System.out.println("========== Ingreso de DATOS ===========");
        System.out.println("Ingrese los valores de la matriz (" + filas + "x" + columnas + "):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscado = teclado.nextInt();

        boolean encontrado = false;
        System.out.println("Buscando el número " + numeroBuscado + " en la matriz...");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == numeroBuscado) {
                    encontrado = true;
                    System.out.println("Número encontrado en la posición: [" + i + "][" + j + "]");
                }
            }
        }

        if (!encontrado) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en la matriz.");
        }

    }
}

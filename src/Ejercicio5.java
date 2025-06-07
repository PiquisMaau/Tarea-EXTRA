import java.util.Scanner;

/*Ejercicio basado en el ejercicio 7.5 del Libro Fundamentos de Programacion
 * Escribir un algoritmo que permita realizar la suma de dos matrices bidimensionales.
 *  Además, el algoritmo debe: Calcular la matriz resultante de la suma.
 *  Mostrar las dos matrices originales y la matriz resultante en formato tabular. 
 * Calcular la suma de todos los elementos de la matriz resultante.
 */
public class Ejercicio5 {

    public static void LecturaeImpresion() {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("========== Lectura de datos de MATRIZ ===========");
        System.out.print("Ingrese el número de filas es: ");
        int filas = Teclado.nextInt();
        System.out.print("Ingrese el número de columnas es: ");
        int columnas = Teclado.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] matrizResultado = new int[filas][columnas];

        System.out.println("Ingrese los valores de la primera matriz:");
        llenarMatriz(matrizA, Teclado);

        System.out.println("Ingrese los valores de la segunda matriz:");
        llenarMatriz(matrizB, Teclado);

        int sumaTotal = sumarMatrices(matrizA, matrizB, matrizResultado);

        System.out.println("\nMatriz A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMatriz B:");
        mostrarMatriz(matrizB);

        System.out.println("\nMatriz Resultante (Suma):");
        mostrarMatriz(matrizResultado);

        System.out.println("\nSumatoria de todos los elementos de la matriz resultante: " + sumaTotal);

    }

    public static void llenarMatriz(int[][] matriz, Scanner Teclado) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Teclado.nextInt();
            }
        }
    }

    public static int sumarMatrices(int[][] matrizA, int[][] matrizB, int[][] matrizResultado) {
        int sumaTotal = 0;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
                sumaTotal += matrizResultado[i][j];
            }
        }
        return sumaTotal;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LecturaeImpresion();
    }
}

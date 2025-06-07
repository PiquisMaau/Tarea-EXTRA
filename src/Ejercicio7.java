import java.util.Scanner;

/*
Ejercicio basado en el ejercicio 7.11 del Libro Fundamentos de Programacion
 * Obtener un algoritmo que efectúe la multiplicación de dos matrices A, B
 */
public class Ejercicio7 {

    public static void LecturaImpresion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de A: ");
        int filasA = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de A (y filas de B): ");
        int columnasA = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de B: ");
        int columnasB = scanner.nextInt();

        int[][] A = new int[filasA][columnasA];
        int[][] B = new int[columnasA][columnasB];

        System.out.println("Ingrese los valores de la matriz A:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los valores de la matriz B:");
        for (int i = 0; i < columnasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        int[][] resultado = MultiplicacionMatrices(A, B, filasA, columnasA, columnasB);

        System.out.println("Matriz resultado:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] MultiplicacionMatrices(int[][] VectorA, int[][] VectorB, int filasA_, int columnasA_,
            int columnasB_) {
        int[][] resultado = new int[filasA_][columnasB_];

        for (int i = 0; i < filasA_; i++) {
            for (int j = 0; j < columnasB_; j++) {
                for (int k = 0; k < columnasA_; k++) {
                    resultado[i][j] += VectorA[i][k] * VectorB[k][j];
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        LecturaImpresion();
    }
}

     import java.util.Scanner;

public class Ejercicio14 {
    /*
     * Ejercicio basado en el ejercicio 82, del libro de Fundamentos de Programación
     * del Ing.Marcelo Villalobos
     * Dadas dos matrices 2x2, obtener la matriz suma, calcular la suma total
     * de todos sus elementos y el promedio de los valores de la matriz resultante.
     * 
     */


    public static void Imprimir() {
        Scanner teclado = new Scanner(System.in);
        int filas = 2, columnas = 2;
        int[][] A = new int[filas][columnas];
        int[][] B = new int[filas][columnas];
        int[][] sumaMatriz = new int[filas][columnas];

        System.out.println("Ingrese los valores de la matriz A (2x2):");
        llenarMatriz(A, teclado);

        System.out.println("Ingrese los valores de la matriz B (2x2):");
        llenarMatriz(B, teclado);

        calcularSuma(A, B, sumaMatriz);

        int sumaTotal = calcularSumaTotal(sumaMatriz);
        double promedio = calcularPromedio(sumaTotal, filas * columnas);

        System.out.println("\nMatriz suma:");
        imprimirMatriz(sumaMatriz);
        System.out.println("\nSuma total de los elementos: " + sumaTotal);
        System.out.println("Promedio de los valores: " + promedio);

    }

    public static void llenarMatriz(int[][] matriz, Scanner teclado) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }
    }

    public static void calcularSuma(int[][] A, int[][] B, int[][] resultado) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                resultado[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    public static int calcularSumaTotal(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        return suma;
    }

    public static double calcularPromedio(int sumaTotal, int elementos) {
        return (double) sumaTotal / elementos;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Imprimir();
    }
}




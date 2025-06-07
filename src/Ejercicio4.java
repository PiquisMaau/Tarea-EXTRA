import java.util.Scanner;

public class Ejercicio4 {
    /*Ejercicio basado en el ejercicio 7.4 del Libro Fundamentos de Programacion

     * Escribir un algoritmo que permita inicializar una matriz de dos dimensiones
     * con un valor constante dado \K \. Además, el algoritmo debe:
     * 
     * Calcular la suma de todos los elementos de la matriz.
     * 
     * Mostrar la matriz en formato tabular.
     * 
     * Permitir al usuario cambiar el valor de \K \ y actualizar la matriz con el
     * nuevo valor.
     */

    public static void LecturaImpresion() {
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = Teclado.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = Teclado.nextInt();

        System.out.print("Ingrese el valor constante K: ");
        int K = Teclado.nextInt();

        int[][] matriz = new int[filas][columnas];
        MatrizInicio(matriz, K);

        ShowMatriz(matriz);
        int suma = calcularSuma(matriz);
        System.out.println("Sumatoria de los elementos: " + suma);

        System.out.print("\nIngrese un nuevo valor de K para actualizar la matriz: ");
        K = Teclado.nextInt();
        MatrizInicio(matriz, K);

        ShowMatriz(matriz);
        suma = calcularSuma(matriz);
        System.out.println("Nueva sumatoria de los elementos: " + suma);

    }

    public static void MatrizInicio(int[][] matriz, int K) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = K;
            }
        }
    }

    public static void ShowMatriz(int[][] matriz) {
        System.out.println("\nMatriz:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print("| " + elemento + "\t |");
            }
            System.out.println();
        }
    }

    public static int calcularSuma(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        LecturaImpresion();
    }
}

import java.util.Random;
import java.util.Scanner;

public class EjercicioPropuestoenClase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el número de filas (n): ");
        int n = teclado.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = teclado.nextInt();

        int[][] matriz1 = new int[n][m];
        int[][] matriz2 = new int[n][m];
        int[][] matrizSuma = new int[n][m];

        llenarMatrizAleatoria(matriz1, random);
        llenarMatrizAleatoria(matriz2, random);

        calcularMatrizSuma(matriz1, matriz2, matrizSuma);

        int mayor = obtenerMayorValor(matriz1);
        int menor = obtenerMenorValor(matriz1);

        int[] sumatoriasHorizontales = obtenerSumatoriasHorizontales(matriz1);
        int[] sumatoriasVerticales = obtenerSumatoriasVerticales(matriz1);

        System.out.println("\nMatriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("\nMatriz 2:");
        imprimirMatriz(matriz2);
        System.out.println("\nMatriz suma:");
        imprimirMatriz(matrizSuma);

        System.out.println("\nSumatoria total de los elementos de la Matriz 1: " + sumarElementosMatriz(matriz1));
        System.out.println("Mayor valor en Matriz 1: " + mayor);
        System.out.println("Menor valor en Matriz 1: " + menor);

        System.out.println("\nSumatorias horizontales:");
        imprimirArray(sumatoriasHorizontales);

        System.out.println("\nSumatorias verticales:");
        imprimirArray(sumatoriasVerticales);

    }

    public static void llenarMatrizAleatoria(int[][] matriz, Random random) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // Valores entre 1 y 100
            }
        }
    }

    public static void calcularMatrizSuma(int[][] matriz1, int[][] matriz2, int[][] matrizSuma) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }

    public static int obtenerMayorValor(int[][] matriz) {
        int mayor = matriz[0][0];
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor > mayor) {
                    mayor = valor;
                }
            }
        }
        return mayor;
    }

    public static int obtenerMenorValor(int[][] matriz) {
        int menor = matriz[0][0];
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor < menor) {
                    menor = valor;
                }
            }
        }
        return menor;
    }

    public static int sumarElementosMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        return suma;
    }

    public static int[] obtenerSumatoriasHorizontales(int[][] matriz) {
        int[] sumatorias = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            sumatorias[i] = suma;
        }
        return sumatorias;
    }

    public static int[] obtenerSumatoriasVerticales(int[][] matriz) {
        int[] sumatorias = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            sumatorias[j] = suma;
        }
        return sumatorias;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    public static void imprimirArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

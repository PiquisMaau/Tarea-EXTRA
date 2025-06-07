import java.util.Scanner;
//Ejercicio basado en el ejercicio 74, del libro de Fundamentos de Programación del Ing.Marcelo Villalobos
//Dado 5 números, obtener la cantidad de números primos ingresados, así como imprime
//los valores de dichos números y saca su promedio
//

public class Ejercicio9 {

    public static void LecturaeImpresion() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        int cantidadPrimos = contarPrimos(numeros);
        int[] primos = obtenerPrimos(numeros);
        double promedioPrimos = calcularPromedio(primos, cantidadPrimos);

        System.out.println("Cantidad de números primos ingresados: " + cantidadPrimos);
        System.out.print("Los números primos son: ");
        for (int valor : primos) {
            if (valor != 0) {
                System.out.print(valor + " ");
            }
        }
        System.out.println("\nPromedio de los números primos: " + promedioPrimos);

    }

    public static boolean SacarPrimo(int valor) {
        if (valor <= 1)
            return false;
        for (int i = 2; i * i <= valor; i++) {
            if (valor % i == 0)
                return false;
        }
        return true;
    }

    public static int contarPrimos(int[] numeros) {
        int contador = 0;
        for (int valor : numeros) {
            if (SacarPrimo(valor)) {
                contador++;
            }
        }
        return contador;
    }

    public static int[] obtenerPrimos(int[] numeros) {
        int[] primos = new int[numeros.length];
        int i = 0;
        for (int valor : numeros) {
            if (SacarPrimo(valor)) {
                primos[i++] = valor;
            }
        }
        return primos;
    }

    public static double calcularPromedio(int[] primos, int cantidad) {
        if (cantidad == 0)
            return 0;
        int suma = 0;
        for (int valor : primos) {
            if (valor != 0) {
                suma += valor;
            }
        }
        return (double) suma / cantidad;
    }

    public static void main(String[] args) {
        LecturaeImpresion();
    }
}

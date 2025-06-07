import java.util.Scanner;
//Ejercicio basado en el ejercicio 73, del libro de Fundamentos de Programación del Ing.Marcelo Villalobos
//Dado 5 números y un divisor, determinar cuantos números
// múltiplos hay del divisor en los 5 números ingresados, ademas dime cuales son esos multiplos
public class Ejercicio8 {
    public static void LecturadeDatosImpresion() {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Ingrese el divisor: ");
        int divisor = teclado.nextInt();

        int cantidadMultiplos = contarMultiplos(numeros, divisor);
        int[] multiplos = obtenerMultiplos(numeros, divisor);

        System.out.println("Cantidad de múltiplos de " + divisor + ": " + cantidadMultiplos);
        System.out.print("Los múltiplos son: ");
        for (int valores : multiplos) {
            if (valores != 0) {
                System.out.print(valores + " | ");
            }
        }

    }

    public static int contarMultiplos(int[] numeros, int divisor) {
        int contador = 0;
        for (int valores : numeros) {
            if (valores % divisor == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int[] obtenerMultiplos(int[] numeros, int divisor) {
        int[] multiplos = new int[numeros.length];
        int i = 0;
        for (int valores : numeros) {
            if (valores % divisor == 0) {
                multiplos[i++] = valores;
            }
        }
        return multiplos;
    }
    public static void main(String[] args) {
        LecturadeDatosImpresion();
    }
}

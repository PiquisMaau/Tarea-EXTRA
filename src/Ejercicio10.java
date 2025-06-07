import java.util.Scanner;

public class Ejercicio10 {
    // Ejercicio basado en el ejercicio 75, del libro de Fundamentos de Programación
    // del Ing.Marcelo Villalobos
    // Busque un número en 7 números ingresados y determine la posición y si existe
    // o no el
    // número buscado, use el método de búsqueda secuencial, también imprime todas
    // las posiciones
    // en las que aparece (en caso de que haya números repetidos).
    //

    public static void LecturaeImpresion() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];
        System.out.println("=========== Lectura de DATOS ============");
        System.out.println("Ingresa 7 números:");
        for (int i = 0; i < 7; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número por buscar: ");
        int numeroBuscado = scanner.nextInt();

        int[] posiciones = buscarNumero(numeros, numeroBuscado);
        boolean encontrado = posiciones.length > 0;

        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " se encontró en las posiciones:");
            for (int pos : posiciones) {
                System.out.print(pos + " ");
            }
            System.out.println();
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en la lista.");
        }

    }

    public static int[] buscarNumero(int[] numeros, int numeroBuscado) {
        int[] posicionesTemp = new int[numeros.length];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                posicionesTemp[contador++] = i;
            }
        }

        int[] posiciones = new int[contador];
        System.arraycopy(posicionesTemp, 0, posiciones, 0, contador);

        return posiciones;
    }

    public static void main(String[] args) {
        LecturaeImpresion();
    }
}

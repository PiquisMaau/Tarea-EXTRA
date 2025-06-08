import java.util.Scanner;

public class Ejercicio17 {
    // Ejercicio basado en la parte de cadenas de caracteres y su conbinacion con
    // vectores en el libro de Fundamentos de Programacion del Ing.Marcelo Villalobos.
    // Dado un carácter ingresado por el usuario, determinar si es una vocal
    // utilizando un vector.
    // En caso de ser vocal, indicar si es mayúscula o minúscula.

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        char[] vocales = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        System.out.println("=========== Lectura de DATOS ===========");
        System.out.print("Ingrese una letra para determinar si es vocal: ");
        char letra = Teclado.next().charAt(0);

        boolean esVocal = false;
        for (char vocal : vocales) {
            if (letra == vocal) {
                esVocal = true;
                break;
            }
        }

        if (esVocal) {
            System.out.println("La letra '" + letra + "' es una vocal.");
            if (Character.isUpperCase(letra)) {
                System.out.println("Es una vocal MAYUSCULA");
            } else {
                System.out.println("Es una vocal minuscula ");
            }
        } else {
            System.out.println("La letra '" + letra + "' no es una vocal.");
        }

    }
}

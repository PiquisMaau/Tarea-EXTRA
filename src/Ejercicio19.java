import java.util.Scanner;

public class Ejercicio19 {
    //
    // Ejercicio basado en la parte de cadenas de caracteres y su conbinacion con
    // vectores en el libro de Fundamentos de Programacion del Ing.Marcelo
    // Villalobos.
    //Dado un nombre extrae la cantidad de caracteres qeu deseé el usuario.

    public static void ProcesoLecturaeImpresion() {
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Ingrese un nombre: ");
        String nombre = Teclado.nextLine();

        System.out.print("Ingrese la cantidad de caracteres a obtener de su nombre: ");
        int n = Teclado.nextInt();

        if (n > nombre.length()) {
            System.out.println("Error: La cantidad de caracteres excede la longitud del nombre.");
        } else {
            char[] caracteres = new char[n];

            for (int i = 0; i < n; i++) {
                caracteres[i] = nombre.charAt(i);
            }

            System.out.println("\nLos primeros " + n + " caracteres son:");
            for (char c : caracteres) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        ProcesoLecturaeImpresion();
    }
}

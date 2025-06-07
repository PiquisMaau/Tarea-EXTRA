import java.util.Scanner;
/*Ejercicio basado en la parte de cadenas de caracteres y su conbinacion con vectores 
en el libro de Fundamentos de Programacion del Ing.Marcelo Villalobos. 
 * dada una frase devolver la frase separada por palabras
 *  y cada palabra almacenada en una celda de un vector
 * 
 * 
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = teclado.nextLine();

        String[] palabras = frase.split(" ");

        System.out.println("\nPalabras separadas:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Celda " + i + ": " + palabras[i]);
        }

    }
}


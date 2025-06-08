import java.util.HashMap;
import java.util.Scanner;
// Ejercicio basado en la parte de cadenas de caracteres y su conbinacion con
    // vectores en el libro de Fundamentos de Programacion del Ing.Marcelo
    // Villalobos.
    //Dado una frase ingresa la cantidad de veces que aparece cada palabra usando vectores.
public class Ejercicio20 {

    public static void LecturaImpresion() {
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = Teclado.nextLine().toLowerCase();

        String[] palabras = separarPalabras(frase);

        HashMap<String, Integer> contadorPalabras = contarPalabras(palabras);

        imprimirFrecuencias(contadorPalabras);

    }

    public static String[] separarPalabras(String frase) {
        return frase.split("\\s+");
    }

    public static HashMap<String, Integer> contarPalabras(String[] palabras) {
        HashMap<String, Integer> contador = new HashMap<>();
        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }
        return contador;
    }

    public static void imprimirFrecuencias(HashMap<String, Integer> contadorPalabras) {
        System.out.println("\nVeces que aparece una palabra:");
        for (String palabra : contadorPalabras.keySet()) {
            System.out.println(palabra + ": " + contadorPalabras.get(palabra));
        }
    }
    public static void main(String[] args) {
        LecturaImpresion();
    }
}
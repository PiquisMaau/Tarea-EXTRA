import java.util.Scanner;
// Ejercicio basado en la parte de cadenas de caracteres y su conbinacion con
    // vectores en el libro de Fundamentos de Programacion del Ing.Marcelo Villalobos.
    //Dado un caracter determina que tipo de caracter es, LETRA, NUMERO, SIMBOLO o si es un caracter
    // desconocido, almacenalos en un vector y bucalos dependiendo la peticion
public class Ejercicio18 {
    public static void LeerImprimir() {
        Scanner Teclado = new Scanner(System.in);

        char[] letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] numeros = "0123456789".toCharArray();
        char[] simbolos = "!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?`~".toCharArray();

        System.out.print("Ingrese un carácter: ");
        char caracter = Teclado.next().charAt(0);

        if (VerificacionCaracter(caracter, letras)) {
            System.out.println("El carácter '" + caracter + "' es una LETRA.");
        } else if (VerificacionCaracter(caracter, numeros)) {
            System.out.println("El carácter '" + caracter + "' es un NÚMERO.");
        } else if (VerificacionCaracter(caracter, simbolos)) {
            System.out.println("El carácter '" + caracter + "' es un SÍMBOLO.");
        } else {
            System.out.println("El carácter '" + caracter + "' no pertenece a ningun tipo de caracter.");
        }

    }

    public static boolean VerificacionCaracter(char caracter, char[] vector) {
        for (char elemento : vector) {
            if (caracter == elemento) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LeerImprimir();
    }
}


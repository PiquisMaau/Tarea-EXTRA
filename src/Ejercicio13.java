import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio13 {
    /*Ejercicio basado en el ejercicio 7.7 del Libro Fundamentos de Programacion
     * Escribir un algoritmo que permita buscar un nombre en una lista de nombres.
     * Además, el algoritmo debe:
     * 
     * Mostrar la posición del nombre si se encuentra en la lista.
     * Permitir al usuario agregar un nuevo nombre a la lista si el nombre buscado
     * no existe.
     * Mostrar la lista actualizada después de agregar un nuevo nombre.
     */
        public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Juan");
        nombres.add("Sofía");
        nombres.add("Luis");

        System.out.println("Lista de nombres: " + nombres);

        System.out.print("Ingrese el nombre que desea buscar: ");
        String nombreBuscado = Teclado.nextLine();

        if (nombres.contains(nombreBuscado)) {
            System.out.println("Nombre encontrado en la lista en la posición: " + nombres.indexOf(nombreBuscado));
        } else {
            System.out.println("Nombre no existe en la lista.");

            System.out.print("¿Desea agregar este nombre a la lista? (Sí/No): ");
            String respuesta = Teclado.nextLine().trim().toLowerCase();

            if (respuesta.equals("sí") || respuesta.equals("si")) {
                nombres.add(nombreBuscado);
                System.out.println("Nombre agregado exitosamente.");
                System.out.println("Lista actualizada: " + nombres);
            }
        }

    }
}



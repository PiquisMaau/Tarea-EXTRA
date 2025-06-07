public class Ejercicio1 {
    // Ejercicio basado en el ejercicio 7.1 del Libro Fundamentos de Programacion
    // Escribir un algoritmo que permita calcular el cubo de los cincuenta primeros
    // números enteros y, a continuación, mostrar una tabla que contenga dichos cien
    // números junto con sus cubos.

    public class CubosNumeros {
        public static void main(String[] args) {
            System.out.println("Número\tCubo");
            System.out.println("-----------------");

            for (int i = 1; i <= 50; i++) {
                int cubo = i * i * i;

                System.out.println(i + "|\t" + cubo);
                System.out.println("-------------------");
            }
        }
    }

}

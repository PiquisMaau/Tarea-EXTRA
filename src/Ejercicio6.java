import java.util.ArrayList;
import java.util.Scanner;
/*Ejercicio basado en el ejercicio 7.9 del Libro Fundamentos de Programacion
 * Éste algoritmo me permite hallar la desviacion estandar y la media de valores 
 * almacenados en un vector, con cantidad de valores pedidas por teclado.
 */
public class Ejercicio6 {

    public static void LecturaeImpresion() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> datos = new ArrayList<>();

        System.out.println("Ingresa la cantidad de valores:");
        int n = scanner.nextInt();

        System.out.println("Ingresa los valores:");
        for (int i = 0; i < n; i++) {
            datos.add(scanner.nextDouble());
        }
        System.out.println("La media es: " + CalculoMedia(n, datos));
        System.out.println("La desviación estándar es: " + CalculoDesviacionEstandar(n, CalculoMedia(n, datos), datos));
    }

    public static double CalculoMedia(int Numero, ArrayList<Double> datos_) {
        double suma = 0;
        for (double valor : datos_) {
            suma += valor;
        }
        double media = suma / Numero;
        return media;
    }

    public static double CalculoDesviacionEstandar(int Numero, double media, ArrayList<Double> datos_) {
        double sumaCuadrados = 0;
        for (double valor : datos_) {
            sumaCuadrados += Math.pow(valor - media, 2);
        }
        double desviacionEstandar = Math.sqrt(sumaCuadrados / (Numero - 1));
        return desviacionEstandar;
    }
    public static void main(String[] args) {
        LecturaeImpresion();
    }

}

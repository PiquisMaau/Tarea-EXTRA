public class Ejercicio11 {
    /*Ejercicio basado en: Ejercicio De Programación Con Java: Arrays Y Matrices.
     * Desarrolla un programa en Java que cree un array de enteros con los valores
     * 10, 20, 30, 40 y 50. El programa debe calcular e imprimir:
     * 
     * La suma de todos los elementos del array
     * El promedio de los elementos
     * El valor más grande del array
     * 
     */
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};


        int suma = 0;
        int maximo = numeros[0]; 
        for (int num : numeros) {
            suma += num;
            if (num > maximo) {
                maximo = num; 
            }
        }
        

   
           System.out.println("Suma de los elementos: " + suma);
        System.out.println("Promedio de los elementos: " + CalcularPromedio(suma, numeros));
        System.out.println("Valor más grande en el array: " + maximo);
    }
    public static double CalcularPromedio(int suma, int[] numeros_){
             double promedio = (double) suma / numeros_.length;
             return promedio;
    }
}



import java.util.Random;

public class EjercicioDado {
    public static void main(String[] args) {
        int[][] dado1 = new int[20][2];

        CargarValoresDados(dado1, 1, 6);

        System.out.println("\nValores generados:");
        LeerImprimir(dado1);

        System.out.println("\nResultados de victorias:");
        int victorias = DevolverVictorias(dado1);
        System.out.println("Cantidad de veces que los valores de una fila son iguales: " + victorias);
    }

    public static void LeerImprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Tirada " + (i + 1) + ": " + matriz[i][0] + " - " + matriz[i][1]);
        }
    }

    public static void CargarValoresDados(int[][] matriz, int rangoInicial, int rangoFinal) {
        Random random = new Random();
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = random.nextInt(rangoFinal - rangoInicial + 1) + rangoInicial;
            }
        }
    }

    public static int DevolverVictorias(int[][] matriz) {
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == matriz[i][1]) {
                contador++;
                System.out.println("Victoria en tirada " + (i + 1) + ": " + matriz[i][0] + " - " + matriz[i][1]);
            }
        }

        return contador;
    }
}

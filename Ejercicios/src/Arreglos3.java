import java.util.Scanner;

public class Arreglos3 {
    public static void main(String[] args) {

        /*
            Leer 7 números por teclado para llenar un arreglo y a
            continuación calcular el promedio de los números positivos,
            el promedio de los negativos y contar el número de ceros.
        */

        int[] numeros = new int[7];
        int totalPositivos = 0, totalNegativos = 0, totalCeros = 0;
        int sumPositivos = 0, sumNegativos = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 7 numeros enteros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            if (numero > 0) {
                totalPositivos++;
                sumPositivos += numero;
            } else if (numero < 0) {
                totalNegativos++;
                sumNegativos += numero;
            } else {
                totalCeros++;
            }
        }

        System.out.println("Promedio de numeros positivos: " + (double) sumPositivos/totalPositivos);
        System.out.println("Promedio de numeros negativos: " + (double) sumNegativos/totalNegativos);
        System.out.println("Cantidad total de ceros: " + totalCeros);
    }
}

import java.util.Scanner;

public class Arreglos5 {
    public static void main(String[] args) {

        /*
            Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
            El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
            Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece
            en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6,
            incluso si no están presente en el arreglo.

            Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:

            1: ***
            2:
            3: *
            4: *****
            5: *
            6: **

            Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
         */

        int[] numeros = new int[12];
        int[] apariciones = new int[6]; //arreglo de contadores

        Scanner scanner = new Scanner(System.in);

        //poblando el arreglo
        System.out.println("Ingrese 12 numeros enteros (en el rango de 1 a 6): ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        //cuento las ocurrencias de cada numero y aumento el contador en el indice correspondiente
        for(int num: numeros){
            apariciones[num-1]++; //si por ej el numero es 1, cuento sus ocurrencias en el indice 0
        }

        //imprimo el histograma
        for (int i = 0; i < apariciones.length; i++) {
            System.out.print((i+1) + ": ");
            for (int j = 0; j < apariciones[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Arreglos4 {
    public static void main(String[] args) {

        /*
            Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
            Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y
            también imprimir la cantidad de veces que aparece en el arreglo.

            Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

            Como resultado debería imprimir lo siguiente:

            La mayor ocurrencias es: 3
            El elemento que mas se repite es: 5

            En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
         */

        int[] numeros = new int[10];
        int[] apariciones = new int[9]; //arreglo de contadores

        Scanner scanner = new Scanner(System.in);

        //poblando el arreglo
        System.out.println("Ingrese 10 numeros enteros (en el rango de 1 a 9): ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        //cuento las ocurrencias de cada numero y aumento el contador en el indice correspondiente
        for(int num: numeros){
            apariciones[num-1]++; //si por ej el numero es 1, cuento sus ocurrencias en el indice 0
        }

        //busco el mayor numero de ocurrencias y obtengo su indice en el arreglo
        int maxIndice = 0;
        for (int i = 1; i < apariciones.length; i++) {
            if(apariciones[i] > apariciones[maxIndice]){
                maxIndice = i;
            }
        }

        //muestro los resultados
        System.out.println("El elemento que mas se repite es: " + (maxIndice + 1));
        System.out.println("La mayor ocurrencias es: " + apariciones[maxIndice]);

    }
}

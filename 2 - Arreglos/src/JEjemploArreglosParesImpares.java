import java.util.Scanner;

public class JEjemploArreglosParesImpares {
    public static void main(String[] args) {

        //quiero detectar de un arreglo a que numeros son pares, cuales impares, y rellenar otro arreglo con cada tipo

        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros enteros: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        //primero determino cuantos numeros son pares y cuantos impares, para poder crear el arreglo de este tamaño
        for (int i = 0; i < a.length; i++) {

            if(a[i] % 2 == 0){
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int auxPares = 0;
        int auxImpares = 0;
        for (int i = 0; i < a.length; i++) {

            if(a[i] % 2 == 0){
                pares[auxPares++] = a[i];
            } else {
                impares[auxImpares++] = a[i];
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\n\nImpares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }

        System.out.println();
    }
}

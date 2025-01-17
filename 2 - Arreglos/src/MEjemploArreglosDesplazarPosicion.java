import java.util.Scanner;

public class MEjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        //quiero que todos los elementos del array se mueva una posicion
        //si por ejemplo tenia 1 2 3 4 5 6 7 8 9 10
        //debe quedar 10 1 2 3 4 5 6 7 8 9

        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }

        System.out.println();

        int ultimo = a[a.length - 1]; //me guardo el ultimo elemento para no perderlo y adelantar el resto una posicion

        for (int i = a.length-2; i >= 0 ; i--) { //parto del penultimo elemento, recorro el array al reves
            a[i+1] = a[i]; //parto de la posicion 9 en este caso, asigno la posicion 10 (la ultima) y asi para atras
        }
        a[0] = ultimo;

        System.out.println("El arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

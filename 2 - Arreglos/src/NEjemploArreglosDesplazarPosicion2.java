import java.util.Scanner;

public class NEjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        //la idea es tener un array con la ultima posicion vacia e insertar un numero en un indice y que a parti de el los elementos se muevan una posicion
        //si por ejemplo tenia 1 2 3 4 5 6 7 8 9 0 e ingreso el 20 en la posicion 3
        //debe quedar 1 2 3 4 20 5 6 7 8 9

        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) { //dejo vacia la ultima posicion
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("Ingrese un nuevo elemento: ");
        int elemento = scanner.nextInt();

        System.out.println("Ingrese la posicion en la cual quiere insertar el elemento (0-9): ");
        int posicion = scanner.nextInt();

        for (int i = a.length-2; i >= posicion ; i--) { //parto del penultimo elemento, recorro el array al reves
            a[i+1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("El arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

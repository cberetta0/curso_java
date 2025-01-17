import java.util.Scanner;

public class OEjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {

        //me ingresa un numero para insertar en mi array ordenado, tengo que determinar en que posicion poner el nuevo elemento
        //si tenia el arreglo 1 3 5 7 9 11 0 y se quiere ingresar el numero 6
        //debe quedar 1 3 5 6 7 9 11

        int[] a = new int[7];
        int numero, posicion;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) { //dej un hueco al final para insertar el nuevo elemento
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese un nuevo elemento: ");
        numero = scanner.nextInt();

        posicion = 0;
        while(posicion < 6 && numero > a[posicion]){
            posicion++;
        }

        for (int i = a.length-2; i >= posicion ; i--) {
            a[i+1] = a[i];
        }
        a[posicion] = numero;

        System.out.println("El nuevo arreglo ordenado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        }
    }
}

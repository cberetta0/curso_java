import java.util.Scanner;

public class LEjemploArreglosBuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("\r\nIngrese el numero a buscar: ");
        int numABuscar = scanner.nextInt();

        int i = 0;
        while (i < a.length && a[i] != numABuscar){ //cuando es igual sale y ya tengo la posicion en i
            i++;
        }

        if(i == a.length){
            System.out.println("Numero no encontrado");
        } else if (a[i] == numABuscar) {
            System.out.println("Encontrado en la posicion: " + i);
        }
    }
}

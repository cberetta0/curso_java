import java.util.Scanner;

public class Arreglos1 {
    public static void main(String[] args) {

        /*
            Leer 10 números enteros desde el teclado para llenar
            un arreglo de 10 elementos. Luego debemos mostrarlos
            en el siguiente orden: el último, el primero, el penúltimo,
            el segundo, el antepenúltimo, el tercero, y así sucesivamente.
         */

        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros enteros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length/2; i++) { //dividido 2 porque muestro dos elementos en cada iteracion
            System.out.println(numeros[i]);
            System.out.println(numeros[numeros.length - 1 - i]);
        }
    }
}

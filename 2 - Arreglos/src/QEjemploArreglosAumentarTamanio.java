import java.util.Scanner;

public class QEjemploArreglosAumentarTamanio {
    public static void main(String[] args) {

        //dada una posicion y un elemento quiero ampliar mi arreglo
        //si por ejemplo tengo 1 2 3 5 6 y se quiero insertar el 4 en la posicion 3
        //deberia quedar 1 2 3 4 5 6 (se amplia el arreglo)

        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("\nIngrese un nuevo elemento: ");
        int elemento = scanner.nextInt();

        System.out.println("Ingrese la posicion en la cual quiere insertar el elemento (0-9): ");
        int posicion = scanner.nextInt();

        int ultimo = a[a.length - 1]; //me guardo el ultimo ya que cuando se empiecen a desplazar las posiciones lo perderia
        for (int i = a.length-2; i >= posicion ; i--) {
            a[i+1] = a[i];
        }
        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[posicion] = elemento;
        b[b.length - 1] = ultimo;

        System.out.println("El arreglo: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

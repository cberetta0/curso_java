import java.util.Scanner;

public class PEjemploArreglosEliminarElemento {
    public static void main(String[] args) {

        //quiero eliminar una posicion de un arreglo
        //por ejemplo si tengo 1 2 3 4 5, y quiero eliminar la posicion 3
        //deberia quedar 1 2 3 5

        int[] a = new int[10];
        int posicion;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese la posicion a eliminar (0-9): ");
        posicion = scanner.nextInt();

        //cuando quiero agregar una posicion, los elementos se desplazan hacia arriba (voy de arriba hacia abajo i--)
        //cuando quiero quitar una posicion, los elementos se desplazan hacia abajo (voy de abajo hacia arriba i++)
        for (int i = posicion; i < a.length - 1; i++) {
            a[i] = a[i+1];
        }

        //copio los elementos de a en b pero eliminado la ultima posicion (quito elhueco)
        int[] b = new int[a.length-1];
        System.arraycopy(a, 0, b, 0, b.length); //origen, de donde parte, destino, de donde parte, tamaño del array

        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]);
        }
    }
}

import java.util.Scanner;

public class IEjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        //quiero determinar si el arreglo esta ordenado o no, y si esta ordenado de que forma (asc o desc)

        int[] a = new int[7];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 7 numeros: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length - 1; i++) { //total - 1, ya que voy a comparar con el siguiente del arreglo y no quiero desborde (en el ultimo va a tratar de comparar con un +1 que no existe)

            if(a[i] > a[i+1]){
                descendente = true;
            }

            if(a[i] < a[i+1]){
                ascendente = true;
            }
        }

        if(ascendente == true && descendente == true){
            System.out.println("Arreglo desordenado");
        }

        if(ascendente == false && descendente == false){
            System.out.println("Todos los elementos del arreglo son iguales");
        }

        if(ascendente == true && descendente == false){
            System.out.println("Arreglo ordenado de forma ascendente");
        }

        if(ascendente == false && descendente == true){
            System.out.println("Arreglo ordenado de forma descendente");
        }
    }
}

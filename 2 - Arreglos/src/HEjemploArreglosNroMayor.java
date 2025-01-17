import java.util.Scanner;

public class HEjemploArreglosNroMayor {
    public static void main(String[] args) {

        //quiero el obtener el numero mayor de un arreglo

        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 numeros enteros: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }

        System.out.println("max = " + max);

        //otra forma
        /*
            for (int i = 1; i < a.length; i++) {
                max = (a[max] > a[i]) ? max: i;
            }
        */
    }
}

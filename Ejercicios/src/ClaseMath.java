import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {

        /*
            Pedir el radio de un círculo y calcular su área. Utilizar la formula:
            area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
        */

            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduzca el radio del circulo");

            double radio = scanner.nextDouble();

            double area = Math.PI * Math.pow(radio, 2);

            System.out.println("El area del circulo es de " + area + " m^2");
    }
}

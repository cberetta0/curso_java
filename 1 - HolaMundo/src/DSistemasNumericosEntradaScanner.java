import java.util.InputMismatchException;
import java.util.Scanner;

public class DSistemasNumericosEntradaScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        //String numeroStr = scanner.nextLine(); //nextLine espera a que el usuario ingrese algo

        int numeroDecimal = 0;
        try{
            //el scanner convierte el string a int directamente
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);

        }catch(InputMismatchException e){ //le hago catch al tipo de exception que devuelva el metodo (nextInt en este caso)
            System.out.println("Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        
        System.out.println("numeroDecimal = " + numeroDecimal);

        //de decimal a string binario
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        //de decimal a string octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        //de decimal a string hexadecimal
        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        //lo imprimo
        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;

        System.out.println(mensaje );
    }
}

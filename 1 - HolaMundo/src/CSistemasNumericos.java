import javax.swing.*;

public class CSistemasNumericos {

    public static void main(String[] args) {

        //nro decimal
        //int numeroDecimal = 500; hardcodeado
        //con ventana de dialogo
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        //de decimal a string binario
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        //de decimal a string octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        //de decimal a string hexadecimal
        String resultadoHexa = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);

        //nro binario
        int numeroBinario = 0b111110100; //le antepongo 0b para q el compilador interprete q es un nro binario
        System.out.println("numeroBinario = " + numeroBinario); //me muestra el 500

        //nro octal
        int numeroOctal = 0764; //le antepongo 0 para q el compilador interprete q es un nro octal
        System.out.println("numeroOctal = " + numeroOctal);

        //nro hexadecimal
        int numeroHexadecimal = 0x1f4; //le antepongo 0x para q el compilador interprete q es un nro hexadecimal
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        //lo muestro con un mensaje dinamico
        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}

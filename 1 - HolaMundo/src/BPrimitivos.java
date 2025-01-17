public class BPrimitivos {

    public static void main(String[] args){

        //PRIMITIVOS ENTEROS

        //BYTE
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte); //shortcut soutv + tab
        //Uso el tipo de dato de referencia equivalente a byte para obtener informacion sobre el tipo
        System.out.println("tipo byte corresponde en bytes a: " + Byte.BYTES); //equivalente en bytes
        System.out.println("tipo byte corresponde en bits a: " + Byte.SIZE); //equivalente en bits
        //rangos
        System.out.println("valor maximo de un byte: " + Byte.MAX_VALUE); //mayor valor
        System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE); //menor valor


        //SHORT
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        //Uso el tipo de dato de referencia equivalente a short para obtener informacion sobre el tipo
        System.out.println("tipo short corresponde en bytes a: " + Short.BYTES); //equivalente en bytes
        System.out.println("tipo short corresponde en bits a: " + Short.SIZE); //equivalente en bits
        //rangos
        System.out.println("valor maximo de un short: " + Short.MAX_VALUE); //mayor valor
        System.out.println("valor minimo de un short: " + Short.MIN_VALUE); //menor valor


        //INT
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        //Uso el tipo de dato de referencia equivalente a int para obtener informacion sobre el tipo
        System.out.println("tipo int corresponde en bytes a: " + Integer.BYTES); //equivalente en bytes
        System.out.println("tipo int corresponde en bits a: " + Integer.SIZE); //equivalente en bits
        //rangos
        System.out.println("valor maximo de un int: " + Integer.MAX_VALUE); //mayor valor
        System.out.println("valor minimo de un int: " + Integer.MIN_VALUE); //menor valor


        //LONG
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        //Uso el tipo de dato de referencia equivalente a long para obtener informacion sobre el tipo
        System.out.println("tipo long corresponde en bytes a: " + Long.BYTES); //equivalente en bytes
        System.out.println("tipo long corresponde en bits a: " + Long.SIZE); //equivalente en bits
        //rangos
        System.out.println("valor maximo de un long: " + Long.MAX_VALUE); //mayor valor
        System.out.println("valor minimo de un long: " + Long.MIN_VALUE); //menor valor


        //PRIMITIVOS FLOAT

        //FLOAT
        float numeroFloat = 2120F; //equivalente a 2.12e3 en notacion cientifica (2.12 * 10^3)
        //le sumo un - si quiero q la coma vaya para la izquierda: 2.12e-3
        System.out.println("numeroFloat = " + numeroFloat);
        //Uso el tipo de dato de referencia equivalente a float para obtener informacion sobre el tipo
        System.out.println("tipo float corresponde en bytes a: " + Float.BYTES); //equivalente en bytes
        System.out.println("tipo float corresponde en bits a: " + Float.SIZE); //equivalente en bits
        //rangos
        System.out.println("valor maximo de un float: " + Float.MAX_VALUE); //mayor valor
        System.out.println("valor minimo de un float: " + Float.MIN_VALUE); //menor valor


        //DOUBLE
        double numeroDouble = 3.4028235E38; //no es necesario agregar la D al final, al tener el . (punto) el nro por default se toma q es double
        System.out.println("numeroDouble = " + numeroDouble);
        //Uso el tipo de dato de referencia equivalente a double para obtener informacion sobre el tipo
        System.out.println("tipo double corresponde en bytes a: " + Double.BYTES); //equivalente en bytes
        System.out.println("tipo double corresponde en bits a: " + Double.SIZE); //equivalente en bits
        //rangos
        System.out.println("valor maximo de un double: " + Double.MAX_VALUE); //mayor valor
        System.out.println("valor minimo de un double: " + Double.MIN_VALUE); //menor valor


        //PRIMITIVOS CARACTERES

        //CHAR
        char caracter = 'A';
        char caracterUnicode = '\u0041'; //equivalente en unicode (puedo usar mapa de caracteres en windows para el codigo)
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("caracterUnicode = " + caracterUnicode);
        //Uso el tipo de dato de referencia equivalente a char para obtener informacion sobre el tipo
        System.out.println("tipo char corresponde en bytes a: " + Character.BYTES); //equivalente en bytes
        System.out.println("tipo char corresponde en bits a: " + Character.SIZE); //equivalente en bits
        //rangos
        System.out.println("valor maximo de un char: " + Character.MAX_VALUE); //mayor valor
        System.out.println("valor minimo de un char: " + Character.MIN_VALUE); //menor valor

        //caracteres especiales
        char espacio = ' ';
        char retoceso = '\b'; //backspace: borra un caracter hacia atras
        char tabulador = '\t';
        char saltoLinea = '\n';


        //PRIMITIVOS BOOLEAN

        //BOOLEAN
        boolean datoLogico = true;
        boolean datoLogicoComoInstancia = Boolean.TRUE;
        //equivalente al de arriba, pero este es una instancia de la clase Boolean con el valor true. Es un objeto
        System.out.println("datoLogico = " + datoLogico);
    }
}

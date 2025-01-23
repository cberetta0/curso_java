package org.cberetta.poosobrecarga;

//importo los metodos estaticos, y no hace falta utilizar el nombre de la clase
import static org.cberetta.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        //esto no haria falta por el import, lo dejo de ejemplo
        System.out.println("sumar int: " + Calculadora.sumar(10, 5));
        System.out.println("sumar float: " + sumar(10.0f, 5f));
        System.out.println("sumar float-int: " + sumar(10f, 5));
        System.out.println("sumar int-float: " + sumar(10, 5.0f));
        System.out.println("sumar double: " + sumar(10.0, 5.0));
        System.out.println("sumar String: " + sumar("10", "5"));
        System.out.println("sumar 3 int: " + sumar(10, 5, 3));

        //no tengo un metodo que reciba long, pero va a tomar el mas cercano, ya que en un float se puede almacenar un long, si este no existiera, entraria al de double, que tmb es un tipo compatible y mayor
        System.out.println("sumar long: " + sumar(10L, 5L));
        System.out.println("sumar int: " + sumar(10, '@')); //el char pasa que ya tiene una representacion numerica, 64. El metodo va a sumar 10 + 64
        System.out.println("sumar int: " + sumar(10f, '@'));

        //argumentos variables
        System.out.println("sumar 4 int: " + sumar(10, 5, 3, 5)); //si fuesen solo 2 o 3 parametros iria al otro metodo que esta definido
        System.out.println("sumar 5 int: " + sumar(10, 5, 3, 5, 8));
        System.out.println("sumar 5 int: " + sumar(10.5f, 10, 5, 9, 8, 15));
    }
}
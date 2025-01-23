package org.cberetta.poosobrecarga;

public class Calculadora {

    //fuerzo a que la clase no se pueda instanciar
    private Calculadora() {
    }

    //para que sea valida la sobrecarga, el tipo de los parametros debe ser distinto o distinta cantidad
    //no se fija en el tipo de dato de retorno, ni los nombres de los param
    //la clase calculadora no tiene un estado interno, es decir no interactua con atributos, sino que solo recibe parametros y ejecuta metodos
    //por esta razon hago los metodos estaticos y los accedo mediante el nombre de la clase y no es necesario que instancie la clase

    public static int sumar(int a, int b){
        return a + b;
    }

    public static float sumar(float a, float b){
        return a + b;
    }

    public static float sumar(int a, float b){
        return a + b;
    }

    public static float sumar(float a, int b){
        return a + b;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            resultado = 0;
        }
        return resultado;
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

    //argumentos variables
    //puede recibir muchos argumentos del mismo tipo, y no hace que escriba manualmente todas las variantes
    public static int sumar(int... argumentos){ //arumentos es un arreglo
        int resultado = 0;
        for (int arg: argumentos){
            resultado += arg;
        }
        return resultado;
    }

    //tambien se puede combinar
    public static float sumar(float a, int... argumentos){
        //int a = argumentos[0]; es un arreglo normal
        float resultado = a;
        for (int arg: argumentos){
            resultado += arg;
        }
        return resultado;
    }
}

import java.util.Random;

public class TClaseMath {
    public static void main(String[] args) {

        //La clase Math, como la clase System no se puede instanciar,son solamente metodos estaticos,
        //se invocan con el nombre de la clase -> Math.metodo

        int valorAbsoluto = Math.abs(-3);
        System.out.println("valorAbsoluto = " + valorAbsoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5); //redondea hacia arriba
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5); //redondea para abajo
        System.out.println("piso = " + piso);

        long redondeo = Math.round(3.5); //redondea a un numero entero, de .5 para arriba para arriba y de .4 para abjo para abajo
        System.out.println("redondeo = " + redondeo);

        System.out.println("Math.PI = " + Math.PI); //constante pi

        System.out.println("Math.E = " + Math.E); //numero de euler

        double exp = Math.exp(1); // e^x
        System.out.println("exp = " + exp);

        double log = Math.log(10); //logaritmo natural, ln (log con base e)
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3); //potencia: 10 elevado a la 3
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5); //raiz cuadrada
        System.out.println("raiz = " + raiz);

        //trigonometria

        double grados = Math.toDegrees(1.57); //para convertir de radianes a grados
        grados = Math.round(grados);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(90.0); //para convertir de grados a radianes
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes)); //el parametro lo espera en radianes
        System.out.println("cos(90): " + Math.cos(radianes));

        //random

        double random = Math.random(); //no incluye al 1, devuelve un nro en el rango [0;1)
        System.out.println("random = " + random);

        //por ejemplo para obtener un random entre 0 y 7 (sin incluir al 7)
        //random *= 7;
        System.out.println("random = " + random);

        //si por ejemplo quiero obtener un color random entre los de un arreglo
        String[] colores = {"azul", "amarillo", "verde", "negro", "rojo", "blanco"};
        random *= colores.length;
        random = Math.floor(random); //redondeo para abajo ya que necesito nros del 1 al 5, que no se incluya el 6

        System.out.println("color aleatorio: " + colores[(int) random]);

        //clase random de java util

        Random randomObj = new Random();

        int randomInt = randomObj.nextInt(); //retorna un numero entero con un amplio rango, incluye negativos y positivos
        System.out.println("randomInt = " + randomInt); //hay next de muchos tipos: double, long, int, etc

        //random entre 1 y 7 (inclusive)
        randomInt = randomObj.nextInt(7+1); //si le paso un nro x como parametro, entonces me va a devolver los numeros de 0 a x (x no incluido)
        //si quiero que x se incluya le sumo 1
        System.out.println("randomInt entre 0 y 7 = " + randomInt);

        //random entre 15 y 25 (inclusive)
        randomInt = 15 + randomObj.nextInt(25-15+1);
        System.out.println("randomInt = " + randomInt);

        //para el ejemplo del arreglo de los colores
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);

    }
}

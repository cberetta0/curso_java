public class LArgumentosPorReferencia {

    public static void main(String[] args) {

        //Pasar argumentos por referencia

        int[] edad = {10, 11, 12};

        System.out.println("Iniciamos el metodo main");

        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("Antes de invocar el metodo test");

        test(edad);

        System.out.println("Despues de invocar el metodo test");

        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]); //para esta altura si veo los valores del arreglo modificados, ya que se pasa una referencia a memoria, un puntero
        }

        System.out.println("Finaliza el metodo main con los datos del arreglo modificados");
    }

    public static void test(int[] edad){

        System.out.println("Iniciamos el metodo test");

        for(int i = 0; i < edad.length; i++){
            edad[i] = edad[i] + 20;
        }

        System.out.println("Finaliza el metodo test");
    }
    
    //Los objetos instanciados de clases que creamos nosotros tambien se pasan por referencia. Por ejemplo una clase persona.
    //Si lo su nombre en el main, lueo la paso a test, en test modifico su nombre, y luego lo vuelvo a leer en main, entonces lo veo actualizado
}

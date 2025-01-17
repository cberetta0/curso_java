public class KArgumentosPorValor {

    public static void main(String[] args) {

        //Pasar argumentos por valor

        int i = 10; //toda variable primitiva se pasa siempre por valor

        System.out.println("Iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor de i = " + i); //sigue siendo 10 en lugar de 35
        //en los primitivos se pasa el valor, no una referencia a memoria, por lo tanto no cambia el valor de i
        //por mas que cambie el int por un Integer, tampoco se obtiene el resultado esperado, las clases Wrapper que
        //representan primitivos son inmutables, cuando se la modifica se obtiene una nueva instancia de esa variable, no se la esta modificando
    }

    public static void test(int i){
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo test con i = " + i);
    }
}

public class AHolaMundo {

    public static void main(String[] args){

        String saludar = "Hola mundo desde Java"; //el tipo de dato string es un tipo de dato por referencia, no primitivo
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase()); //al ser un objeto uso metodos

        //int es un tipo de dato primitivo pero Integer no, es de referencia (tiene metodos, entre ellos para la conversion de tipos de dato)
        int numero = 10;
    }
}

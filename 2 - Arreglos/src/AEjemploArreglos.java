import java.util.Arrays;

public class AEjemploArreglos {
    public static void main(String[] args) {

        //declarar un arreglo:
        //TipoDeDato[] nombreArr = new TipoDeDato[cantidad de elementos]
        //o TipoDeDato[] nombreArr = {elemento1, elemento2, elemento3}

        //arreglo de numeros enteros
        int[] numeros = new int[4]; //se inicializa en 0

        //asigno los valores
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        //Arrays.sort(numeros); //ordena de menor a mayor

        //accedo a los valores
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3]; //3 lo podria poner como numeros.length - 1 (ultimo valor)

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        //arreglo de strings
        String[] productos = new String[7]; //se inicializa en null

        //asigno los valores
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        //ordenando de forma alfabetica el arreglo (sirve para cualquier tipo de dato)
        //la clase Arrays es una clase helpers: trae metodos utiles para trabajar con arreglos
        Arrays.sort(productos);

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);
    }
}

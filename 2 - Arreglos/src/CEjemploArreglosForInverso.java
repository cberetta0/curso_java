import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class CEjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generacion", "Bicicleta Oxford"};
        int total = productos.length;

        Arrays.sort(productos);

        System.out.println("=== for inverso 1 ===");

        for (int i = total-1; i >= 0; i--) {
            System.out.println("para indice " + i + ": " + productos[i]);
        }

        System.out.println("=== for inverso 2 ===");

        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + (total-1-i) + ": " + productos[total-1-i]);
        }
        
        //dar vuelta el arreglo con la api collections
        Collections.reverse(Arrays.asList(productos)); //el metodo reverse espera una lista, por eso convierto el arreglo
        
        //hacer lo mismo pero a mano
        arregloInverso(productos);

    }
    
    public static void arregloInverso(String[] arreglo){
         int total = arreglo.length;
        for (int i = 0; i < total/2; i++) { //lo hago hasta la mitad del arreglo porq si uso el total completo se empieza a reversar lo q ya se cambio
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i]; //elemento inverso al actual
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
        }
    }

    //alternativa2
    /*
    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) { //lo hago hasta la mitad del arreglo porq si uso el total completo se empieza a reversar lo q ya se cambio
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i]; //elemento inverso al actual
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    */
}

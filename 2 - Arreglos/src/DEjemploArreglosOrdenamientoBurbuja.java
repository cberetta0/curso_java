public class DEjemploArreglosOrdenamientoBurbuja {
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generacion", "Bicicleta Oxford"};

        //ordenamiento burbuja

        int total = productos.length;

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if(productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
            }
        }

        //ordena pero es poco eficiente porq compara muchas veces

        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + ": " + productos[i]);
        }

        //burbuja mejorado

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) { //al total le resto 1 porq comparo hasta el j + 1 y no quiero que desborde el arreglo e i porq las ultimas posiciones van quedando ya ordenadas
                if(productos[j+1].compareTo(productos[j]) < 0){ //voy comparando de a dos elementos, el actual y el siguiente
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
            }
        }

        //con un arreglo de enteros
        int[] numeros = new int[4];

        numeros[0] = 40;
        numeros[1] = 20;
        numeros[2] = 345;
        numeros[3] = 5;

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if( ((Integer) numeros[j+1]).compareTo(numeros[j] ) < 0){
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + i + ": " + numeros[i]);
        }

        //estoy repitiendo muchas veces el for, podria armar un metodo que reciba un generico y me sirva para cualquier tipo de arreglo
        //sortBurbuja((numeros); para usarlo asi cambio la difinicion del array por Inteegr[] numeros = new Integer[4]
        sortBurbuja(productos);
    }

    public static void sortBurbuja(Object[] arreglo){ //hago que reciba un tipo generico para q me sirva con cualquier tipo de array

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j] ) < 0){ //si cambio el menor por el mayor ordena descendente, de arriba hacia abajo
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }
    }
}

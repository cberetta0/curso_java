public class GEjemploArreglosCombinados2 {
    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        //quiero combinar ambos arreglos a y b en un tercero c
        //intercalo 2 elementos de a con 2 elementos de b sucesivamente
        //para que esto funcione, los elementos que agregue tienen que ser multiplos de la cantidad del array (en este caso 2 es multiplo de 10 y de 20)
        //por ej tmb funciona con 2 arrays de 12 elementos, uno combinado de 24 elementos y poniendo 3 de a y 3 de b

        //relleno a
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }

        //relleno b
        for (int i = 0; i < b.length; i++) {
            b[i] = (i+1)*5;
        }

        int aux = 0;
        for (int i = 0; i < 10; i+=2) { //serian 5 iteraciones
            for (int j = 0; j < 2; j++) {
                c[aux++] = a[i+j];
            }
            for (int j = 0; j < 2; j++) {
                c[aux++] = b[i+j];
            }
        }

        //muestro los elementos de c
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}

public class FEjemploArreglosCombinados {
    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        //quiero combinar ambos arreglos a y b en un tercero c
        //intercalo un elemento de a y un elemento de b sucesivamente

        //relleno a
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }

        //relleno b
        for (int i = 0; i < b.length; i++) {
            b[i] = (i+1)*5;
        }

        int aux = 0;
        for (int i = 0; i < 10; i++) { //alcanza con 10 iteraciones, ya que en cada una asigno 1 item de cada array a c (tambien podria haber usado el length de a o b)
            c[aux++] = a[i];
            c[aux++] = b[i]; //aux se va incrementando en cada vez para llenar completo el arreglo c (post incremento, primero asigna y luego se incrementa)
        }

        //muestro los elementos de c
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}

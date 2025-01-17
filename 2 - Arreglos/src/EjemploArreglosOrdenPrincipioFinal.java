public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];

        //completa el arreglo con numeros del 1 al 10
        // 1 2 3 4 5 6 7 8 9 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }

        //relleno un arreglo a con un numero del principio y otro del final y asi sucesivamente
        //quiero que contenga 1 10 2 9 3 8 4 7 5 6
        int aux = 0;
        for (int i = 0; i < numeros.length/2; i++) { //dividido 2 para que no se empiecen a repetir los numeros, o tmb podria restarle i al total para que itere la mitad
            System.out.print(numeros[i] + " "); //imprime del 1 en adelante
            System.out.println(numeros[numeros.length - 1 - i]); //imprime del 10 hacia atras (length - 1 es el ultimo elemento del array, y - i para que decremente)
            a[aux] = numeros[i]; //voy llenando el arreglo a en este orden, 1 10 2 9 3 8 4 7 etc
            a[aux+1] = numeros[numeros.length - 1 - i];
            aux += 2; //incremento en 2 para q en cada iteracion complete dos posiciones y no se pise (otra opcion es poner a[aux++] en cada asignacion y asi se incrementa solo)
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + "valor: " + a[i]);
        }
    }
}

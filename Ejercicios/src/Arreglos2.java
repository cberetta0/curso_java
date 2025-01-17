public class Arreglos2 {
    public static void main(String[] args) {

        /*
            Escriba un programa que imprima el número más alto de
            un arreglo de 7 elementos (de rango 11 a 99), por ejemplo
            {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
         */

        int[] numeros = {14, 33, 15, 36, 78, 21, 43};
        int max = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > max){
                max = numeros[i];
            }
        }

        System.out.println("El maximo valor es " + max);

        //otra opcion
        //for(int num: numeros){
        //   if(num > max) max = num;
        //}
    }
}

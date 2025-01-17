public class EjemploMatricesBuscarElemento {
    public static void main(String[] args) {

        int[][] matrizDeEnteros = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementoABuscar = 15;
        boolean encontrado = false;

        int i;
        int j = 0;
        buscar: for (i = 0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if(matrizDeEnteros[i][j] == elementoABuscar){
                    encontrado = true;
                    break buscar; //utilizo una etiqueta para salirme de ambos for, el break solo me sacaba unicamente del for anidado
                }
            }
        }

        if(encontrado){
            System.out.println("Encontrado " + elementoABuscar + " en las coordenadas " + i + ", " + j);
        } else {
            System.out.println(elementoABuscar + " no se encontro en la matriz");
        }
    }
}

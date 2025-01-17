public class GEjemploMatricesTraspuesta {
    public static void main(String[] args) {

        //quiero trasponer una matriz

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {8, 10, 11, 12},
                {13, 14, 15, 16}
        };

        //para obtener la matriz traspuesta hay que intercambiar filas por columnas

        //primero muestro la matriz original
        System.out.println("Matriz original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        //matriz traspuesta de la original
        //no hace falta recorrer toda la matriz, ya que a partir de la mitad se empezarian a reversar los cambios
        //solo recorre la diagonal inferior
        int aux;
        for (int i = 0; i < matriz.length; i++) { // i podria partir de 1 ya que si arranca de 0 nunca entra al segundo for
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        System.out.println("Matriz traspuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

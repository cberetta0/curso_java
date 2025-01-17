public class DEjemploMatricesColumnasVariable {
    public static void main(String[] args) {

        int[][] matriz = new int[3][];
        //esta matriz va a tener 3 filas pero la cantidad de columnas va a ser variable, por lo que omito el numero

        matriz[0] = new int[2]; //una matriz al final es un arreglo de arreglos,en cada elemento va a tener otro arreglo
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        System.out.println("cantidad de filas: " + matriz.length);
        System.out.println("fila 0 length: " + matriz[0].length);
        System.out.println("fila 1 length: " + matriz[1].length);
        System.out.println("fila 2 length: " + matriz[2].length);

        //poblando la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i*j;
            }
        }

        //muestro sus elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

public class LEjemploMatricesMarco {
    public static void main(String[] args) {

        //rellenar una matriz con unos en la prim columna, primer fila, ultima fila y primer columna
        //ejemplo
        /*
            1 1 1 1 1
            1 0 0 0 1
            1 0 0 0 1
            1 1 1 1 1
         */

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == 0 || i == matriz.length - 1
                 || j == 0 || j == matriz[i].length - 1){
                    matriz[i][j] = 1;
                }
            }
        }

        //el resto de los elementos por defecto se completan con cero por ser int el tipo de dato

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

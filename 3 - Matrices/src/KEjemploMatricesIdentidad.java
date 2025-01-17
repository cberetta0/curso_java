public class KEjemploMatricesIdentidad {
    public static void main(String[] args) {

        //rellenar una matriz como la matriz identidad (todos ceros, menos la diag ppal que son todos 1)

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j){
                    matriz[i][j] = 1; //la diag ppal se identifica porque es cuando i y j son iguales, ej fila 0 columna 0, fila 1 columna 1, etc
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

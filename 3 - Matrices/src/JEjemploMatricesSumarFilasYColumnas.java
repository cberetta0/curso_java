public class JEjemploMatricesSumarFilasYColumnas {
    public static void main(String[] args) {

        //quiero obtener la suma de cada fila y cada columna

        int sumaFila, sumaColumna;
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < a.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumaFila += a[i][j];
                sumaColumna += a[j][i]; //la columna es la traspuesta
            }
            System.out.println("Total fila " + i + ": " + sumaFila);
            System.out.println("Total columna " + i + ": " + sumaColumna);
        }
    }
}

public class HEjemploMatricesTrasponerMatriz {
    public static void main(String[] args) {

        //la idea es llenar la matriz b para que se la traspuesa de a

        int[][] a, b;
        a = new int[8][4];
        b = new int[4][8];
        //como a no es una matriz cuadrada, para que se pueda trasponer, b debe tener invertida la cantidad de filas y columnas

        System.out.println("Matriz a: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i+j*3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j]; //b[j][i] porque quiero la traspuesta
            }
        }

        System.out.println("Matriz traspuesta b: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

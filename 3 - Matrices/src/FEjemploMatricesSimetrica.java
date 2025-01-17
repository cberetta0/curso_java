public class FEjemploMatricesSimetrica {
    public static void main(String[] args) {

        //quiero averiguar si una matriz es simetrica o no

        boolean simetrica = true; //aranco asumiendo que la matriz es simetrica

        int[][] matriz = { //las dos mitades por fuera de la diagonal ppal estan espejadas
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        //me doy cuenta si es simetrica si un elemento es igual a su traspuesto
        // matriz[i][j] == matriz[j][i]
        //o tmb comparar 1 fila con 1 columna, 2 fila con 2 columna, y asi sucesivamente

        int i, j;
        i = 0;
        while(i < matriz.length && simetrica){
            j = 0;
            while(/*j < matriz[i].length*/ j < i && simetrica){ //itero mientras j < i para que no hayan validaciones dobles, recorro solo la mitad de la matriz
                //recorreria solo a mitad por debajo de la diag ppal -> nada en la 1 fila, el 2 en la 2 fila, el 3 y 0 en la 3 fila y el 4, 5, 6 en la 4 fila
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
                j++;
            }
            i++;
        }

        /* otra forma
            salir: for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < i; j++){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                        break salir;
                    }
                }
            }
        */

        if(simetrica){
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }
    }
}

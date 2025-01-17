public class CEjemploMatricesStringFor2 {
    public static void main(String[] args) {

        //la forma directa de declarar una matriz
        String[][] nombres = { {"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"} }; // { {fila1}, {fila2}, {fila3} } en cada fila adentro van las columnas

        System.out.println("Iterando con foreach: ");
        for(String[] fila: nombres){

            for(String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}

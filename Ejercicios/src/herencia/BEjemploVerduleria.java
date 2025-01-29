package herencia;

public class BEjemploVerduleria {
    public static void main(String[] args) {

        /*
            Para la tarea se pide desarrollar un diseño orientado a objetos para
            un almacén y verdulería, como requerimiento vamos a tener 4 clases de
            productos Fruta, Limpieza, Lacteo y NoPerecible, todas tiene en común
            dos atributos el nombre (string) y precio (double) que deben heredar
            de la clase padre Producto, pero ademas cada una van a tener dos
            atributos propios adicionales, sus métodos getter y constructor para
            inicializar los 4 atributos (los 2 del padre y los 2 propios).
            Para el ejemplo de la clase main se pide crear dos objetos por cada
            tipo de producto que deben ser almacenados en un arreglo del tipo
            Producto, se debe mostrar iterando el arreglo, por cada uno el detalle
            completo, el precio, nombre y los atributos adicionales.
         */

        BProducto[] productos = new BProducto[8];

        productos[0] = new BLacteo("leche", 45, 5, 100);
        productos[1] = new BLacteo("queso", 70, 2, 120);
        productos[2] = new BFruta("sandia", 20, "Rojo y verde", 200);
        productos[3] = new BFruta("uvas", 30, "Verde", 150);
        productos[4] = new BLimpieza("jabon en polvo", 45, "jabon, aromas", 2);
        productos[5] = new BLimpieza("limpia vidrios", 35, "limpieza, aromas", 1);
        productos[6] = new BNoPerecible("fideos", 15, 2, 50);
        productos[7] = new BNoPerecible("cereales", 20, 1, 20);

        for (BProducto producto: productos){
            System.out.println(producto);
        }

        //Otra forma si no tuviese el toString implementado

        /*
            for (Producto prod : productos) {
                System.out.println("-------------------------------- " + prod.getClass().getSimpleName() + "---------------------------------");
                System.out.println("Nombre: " + prod.getNombre());
                System.out.println("Precio: " + prod.getPrecio());

                if (prod instanceof Fruta) {
                    System.out.println("Peso (gr): " + ((Fruta) prod).getPeso());
                    System.out.println("Color: " + ((Fruta) prod).getColor());
                } else if (prod instanceof Limpieza) {
                    System.out.println("Componentes: " + ((Limpieza) prod).getComponentes());
                    System.out.println("Litros: " + ((Limpieza) prod).getLitros());
                } else if (prod instanceof Lacteo) {
                    System.out.println("Cantidad (gr/cc): " + ((Lacteo) prod).getCantidad());
                    System.out.println("Proteinas (gr): " + ((Lacteo) prod).getProteinas());
                } else if (prod instanceof NoPerecible) {
                    System.out.println("Calorias (kCal): " + ((NoPerecible) prod).getCalorias());
                    System.out.println("Contenido neto (gr): " + ((NoPerecible) prod).getContenido());
                }
            }
         */
    }
}

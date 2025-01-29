package herencia;

public class BLacteo extends BProducto {

    private int cantidad;
    private int proteinas;

    public BLacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cantidad: " + cantidad +
                ", proteinas: " + proteinas + "\n";
    }
}

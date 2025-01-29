package herencia;

public class BProducto {

    protected String nombre;
    protected double precio;

    public BProducto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "- " +
                "nombre: " + nombre +
                ", precio: " + precio;
    }
}

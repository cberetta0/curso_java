package herencia;

public class BNoPerecible extends BProducto {

    private int contenido;
    private int calorias;

    public BNoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", contenido: " + contenido +
                ", calorias: " + calorias + "\n";
    }
}

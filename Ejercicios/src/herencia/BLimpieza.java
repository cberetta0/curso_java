package herencia;

public class BLimpieza extends BProducto {

    private String componentes;
    private double litros;

    public BLimpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", componentes: " + componentes +
                ", litros: " + litros + "\n";
    }
}

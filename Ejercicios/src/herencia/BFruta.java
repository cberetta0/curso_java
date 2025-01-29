package herencia;

public class BFruta extends BProducto {

    private String color;
    private double peso;

    public BFruta(String nombre, double precio, String color, double peso) {
        super(nombre, precio);
        this.color = color;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", color: " + color +
                ", peso: " + peso + "\n";
    }
}

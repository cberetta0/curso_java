package interfaces;

public class IPhone extends Electronico {

    private String modelo;
    private String color;

    public IPhone(String fabricante, int precio, String modelo, String color) {
        super(fabricante, precio);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 0.9;
    }
}

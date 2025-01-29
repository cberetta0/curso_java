package interfaces;

public class TvLcd extends Electronico {

    private int pulgadas;

    public TvLcd(String fabricante, int precio, int pulgadas) {
        super(fabricante, precio);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 0.8;
    }
}

public class HMotor {

    private double cilindrada;
    private KTipoMotor tipo;

    public HMotor() {
    }

    public HMotor(double cilindrada, KTipoMotor tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public KTipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(KTipoMotor tipo) {
        this.tipo = tipo;
    }
}

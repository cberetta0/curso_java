package herencia;

public class AGerente extends AEmpleado {

    private double presupuesto;

    public AGerente(String nombre, String apellido, String numeroFiscal, String direccion, int empleadoId, double remuneracion, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, empleadoId, remuneracion);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + ", \n" +
                "presupuesto=" + presupuesto;
    }
}

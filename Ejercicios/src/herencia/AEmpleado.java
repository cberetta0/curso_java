package herencia;

public class AEmpleado extends APersona {

    private int empleadoId;
    private double remuneracion;

    public AEmpleado(String nombre, String apellido, String numeroFiscal, String direccion, int empleadoId, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = empleadoId;
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion *= (1 + porcentaje/100.0);
    }

    @Override
    public String toString() {
        return super.toString() + ", \n" +
                "empleadoId=" + empleadoId + ", \n" +
                "remuneracion=" + remuneracion;
    }
}

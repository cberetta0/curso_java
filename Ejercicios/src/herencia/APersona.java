package herencia;

public class APersona {

    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    public APersona(String nombre, String apellido, String numeroFiscal, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", \n" +
                "apellido=" + apellido + ", \n" +
                "numeroFiscal=" + numeroFiscal + ", \n" +
                "direccion=" + direccion;
    }
}

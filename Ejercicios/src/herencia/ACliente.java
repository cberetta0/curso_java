package herencia;

public class ACliente extends APersona {

    private int clienteId;

    public ACliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString() + ", \n" +
                "clienteId=" + clienteId;
    }
}

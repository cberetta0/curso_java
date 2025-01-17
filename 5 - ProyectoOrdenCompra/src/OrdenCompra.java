import java.util.Date;

public class OrdenCompra {

    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos;
    private static int ultimoIdAsignado;

    public OrdenCompra(String descripcion){
        this.id = ++ultimoIdAsignado;
        this.productos = new Producto[4];
        this.descripcion = descripcion;
    }

    public int getId(){
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public void addProducto(Producto producto){

        if(indiceProductos+1 > this.productos.length){
            System.out.println("Se ha excedido el maximo de 4 productos");
        } else {
            this.productos[indiceProductos++] = producto;
        }
    }

    public int calcularTotal(){

        int totalOrden = 0;

        for(Producto producto: productos){
            totalOrden += producto.getPrecio();
        }

        return totalOrden;
    }
}

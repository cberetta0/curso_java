package org.cberetta.appfacturas.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio; //id
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(Cliente cliente, String descripcion) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio; //pre incremento para que comience en uno
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if(indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal(){

        float total = 0.0f;

        for(int i = 0; i < indiceItems; i++){ //itero hasta los items que se que agregue, asi me aseguro que no haya nulos (si cargo menos que el maximo)
            total += this.items[i].calcularImporte();
        }

        return total;
    }

    public String generarDetalle(){ //el append retorna this (el mismo objeto) por lo que lo puedo llamar uno atras de otro

        StringBuilder sb = new StringBuilder("Factura N°"); //conviene utilizar un string builder ya que estoy concatenando gran cantidad de datos, y sobre todos cuando tenemos un for en el medio (al ponerlo se va el warning)
        sb.append(this.folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(this.cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, YYYY");

        sb.append("Fecha emision: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for(int i = 0; i < indiceItems; i++){

            sb.append(this.items[i]) //solo dejo el item porque tengo armado el toString
                    .append("\n");
            /*
                sb.append(item.getProducto().getId())
                        .append("\t")
                        .append(item.getProducto().getNombre())
                        .append("\t")
                        .append(item.getProducto().getPrecio())
                        .append("\t")
                        .append(item.getCantidad())
                        .append("\t")
                        .append(item.calcularImporte())
                        .append("\n");
             */
        }

        sb.append("\nGran total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}

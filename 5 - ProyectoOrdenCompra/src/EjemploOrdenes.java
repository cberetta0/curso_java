import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        //creo las ordenes

        //orden1
        OrdenCompra orden1 = new OrdenCompra("Orden numero 1");
        orden1.setCliente(new Cliente("Chiara", "Beretta"));
        orden1.setFecha(new Date());
        orden1.addProducto(new Producto("Samsung", "Smartphone Galaxy Z12", 1299));
        orden1.addProducto(new Producto("Lenovo", "Notebook ThinkPad X1 Carbon", 1799));
        orden1.addProducto(new Producto("LG", "Televisor OLED CX 55\"", 999));
        orden1.addProducto(new Producto("Dyson", "Aspiradora Dyson V15 Detect", 799));

        //orden2
        OrdenCompra orden2 = new OrdenCompra("Orden numero 2");
        orden2.setCliente(new Cliente("Justina", "Beretta"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Sony", "Cámara Alpha 7 IV", 2499));
        orden2.addProducto(new Producto("Apple", "Reloj Apple Watch Series 9", 399));
        orden2.addProducto(new Producto("Philips", "Air Fryer XXL", 249));
        orden2.addProducto(new Producto("Siemens", "Lavavajillas iQ500", 1199));


        //orden3
        OrdenCompra orden3 = new OrdenCompra("Orden numero 3");
        orden3.setCliente(new Cliente("Fabio", "Beretta"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Autonomous", "Silla ergonómica ErgoChair Pro", 499));
        orden3.addProducto(new Producto("Nike", "Zapatillas Air Max 270", 159));
        orden3.addProducto(new Producto("Specialized", "Bicicleta Eléctrica Turbo Vado SL", 3599));
        orden3.addProducto(new Producto("Sony", "Consola PlayStation 5", 499));

        //imprimo valores

        //orden1
        System.out.println("Orden numero 1: ");
        System.out.println("Id: " + orden1.getId());
        System.out.println("Descripcion: " + orden1.getDescripcion());
        System.out.println("Fecha en que fue realizada: " + orden1.getFecha());
        System.out.println("Cliente: " + orden1.getCliente().getNombre() + " " + orden1.getCliente().getApellido());
        System.out.println("Productos: ");
        for (Producto producto: orden1.getProductos()) {
            System.out.println("\t Fabricante: " + producto.getFabricante());
            System.out.println("\t Nombre: " + producto.getNombre());
            System.out.println("\t Precio: " + producto.getPrecio());
            System.out.println("\t -----------------------------");
        }
        System.out.println("El total de la compra es de $" + orden1.calcularTotal());

        //orden2
        System.out.println("Orden numero 2: ");
        System.out.println("Id: " + orden2.getId());
        System.out.println("Descripcion: " + orden2.getDescripcion());
        System.out.println("Fecha en que fue realizada: " + orden2.getFecha());
        System.out.println("Cliente: " + orden2.getCliente().getNombre() + " " + orden2.getCliente().getApellido());
        System.out.println("Productos: ");
        for (Producto producto: orden2.getProductos()) {
            System.out.println("\t Fabricante: " + producto.getFabricante());
            System.out.println("\t Nombre: " + producto.getNombre());
            System.out.println("\t Precio: " + producto.getPrecio());
            System.out.println("\t -----------------------------");
        }
        System.out.println("El total de la compra es de $" + orden2.calcularTotal());

        //orden3
        System.out.println("Orden numero 3: ");
        System.out.println("Id: " + orden3.getId());
        System.out.println("Descripcion: " + orden3.getDescripcion());
        System.out.println("Fecha en que fue realizada: " + orden3.getFecha());
        System.out.println("Cliente: " + orden3.getCliente().getNombre() + " " + orden3.getCliente().getApellido());
        System.out.println("Productos: ");
        for (Producto producto: orden3.getProductos()) {
            System.out.println("\t Fabricante: " + producto.getFabricante());
            System.out.println("\t Nombre: " + producto.getNombre());
            System.out.println("\t Precio: " + producto.getPrecio());
            System.out.println("\t -----------------------------");
        }
        System.out.println("El total de la compra es de $" + orden3.calcularTotal());
    }
}

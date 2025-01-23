import org.cberetta.appfacturas.domain.*;

import java.util.Scanner;

public class EjemploFacturas {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Chiara");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la descripcion de la factura: ");
        Factura factura = new Factura(cliente, scanner.nextLine());

        Producto producto;

        System.out.println();

        for (int i = 0; i < 5 ; i++) {

            producto = new Producto();
            System.out.print("Ingrese el producto n°" + producto.getId() + ": ");
            producto.setNombre(scanner.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(scanner.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(scanner.nextInt(), producto));

            System.out.println();
            scanner.nextLine(); //muevo el cursor
        }
        System.out.println(factura); //solo imprimo factura porque genere el toString
    }
}

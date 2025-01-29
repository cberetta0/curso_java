package org.cberetta.poointerfaces;

import org.cberetta.poointerfaces.crud.*;
import org.cberetta.poointerfaces.modelo.Cliente;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        CrudRepositorio repo = new ClienteListRepositorio(); //Utilizo la interfaz mas generica (Crud), y la implementa la clase ClienteRepo
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Bea", "Gonzalez"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Andres", "Guzman"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("==== paginable ===="); //hago el casteo para que se encuntre los metodos de la interfaz paginable
        List<Cliente> clientesPaginable = ((PaginableRepositorio)repo).listar(1, 3);
        clientesPaginable.forEach(System.out::println);

        System.out.println("==== orden asc nombre ====");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);

        System.out.println("==== orden desc apellido ====");
        List<Cliente> clientesOrdenDesc = ((OrdenableRepositorio)repo).listar("apellido", Direccion.DESC);
        clientesOrdenDesc.forEach(System.out::println);

        System.out.println("==== editar ====");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2); //no quiero que le modifique el id
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);

        System.out.println("==== eliminar ====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("==== total ====");
        System.out.println(((ContableRepositorio)repo).total());
    }
}

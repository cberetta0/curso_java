package org.cberetta.poointerfaces.crud;

import org.cberetta.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio, ContableRepositorio {
    //se pueden implementar multiples interfaces, no asi con la herencia
    //En lugar de implementar varias interfaces podria armar una cuarta que extienda de crud, ordenable y paginable (con interfaces si se permite la herencia multiple)
    //esta interfaz agruparia todos los metodos en una y me evitaria los casteos y demas

    //contenedor de datos y donde realizo las operaciones
    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for (Cliente cliente: this.dataSource){
            if(cliente.getId() != null && cliente.getId().equals(id)){ //uso equals porq el id es Integer
                resultado = cliente;
                break; //salgo del for cuando lo encuentro
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente clienteEditado) {
        Cliente clienteOriginal = this.porId(clienteEditado.getId());
        clienteOriginal.setNombre(clienteEditado.getNombre());
        clienteOriginal.setApellido(clienteEditado.getApellido());
    }

    @Override //implemento el metodo equals en cliente para que el remove pueda comparar
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    //listar para ordenar
    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {

        //duplico la lista de clientes para no modificar la original cada que la ordeno
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);

        //implemento la interfaz Comparator con una clase anonima
        listaOrdenada.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                int resultado = 0;
                if(direccion == Direccion.ASC){
                    resultado = this.ordenar(a, b);
                } else if(direccion == Direccion.DESC) {
                    resultado = this.ordenar(b, a);
                }
                return resultado;
            }

            private int ordenar(Cliente a, Cliente b){
                int resultado = 0;
                switch (campo){
                    case "id":
                        resultado = a.getId().compareTo(b.getId());
                        break;
                    case "nombre":
                        resultado = a.getNombre().compareTo(b.getNombre());
                        break;
                    case "apellido":
                        resultado = a.getApellido().compareTo(b.getApellido());
                        break;
                }
                return resultado;
            }

        });
        return listaOrdenada;
    }

    //listar paginado
    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta); // el desde se incluye pero el hasta no [desde; hasta)
    }

    //contable
    @Override
    public int total() {
        return this.dataSource.size(); //total de registros
    }
}

package org.cberetta.poointerfaces.crud;

import org.cberetta.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {

    //no hace falta poner public
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}

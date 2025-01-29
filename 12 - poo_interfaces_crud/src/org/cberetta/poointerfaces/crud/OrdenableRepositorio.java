package org.cberetta.poointerfaces.crud;

import org.cberetta.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion direccion);
}

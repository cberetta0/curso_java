package org.cberetta.poointerfaces.crud;

import org.cberetta.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> listar(int desde, int hasta);
}

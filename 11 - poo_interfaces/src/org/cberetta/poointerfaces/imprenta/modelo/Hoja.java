package org.cberetta.poointerfaces.imprenta.modelo;

abstract public class Hoja {

    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    //todas las clases que hereden de hoja estan obligadas a implementar el metodo imprimir,
    //independiente de si en la interfaz es un metodo default o no
    abstract public String imprimir();
}

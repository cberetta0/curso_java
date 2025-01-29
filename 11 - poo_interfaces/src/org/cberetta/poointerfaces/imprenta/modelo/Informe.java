package org.cberetta.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible {

    private Persona autor;
    private Persona revisor;

    //como el padre tiene un constructor que recibe contenido, el hijo esta obligado a implementarlo tmb
    public Informe(String contenido, Persona autor, Persona revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor
                + "\nRevisado por: " + this.revisor
                + "\n" + this.contenido + "\n";
    }
}

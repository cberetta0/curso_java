package org.cberetta.pooclasesabstractas.form.elementos;

import org.cberetta.pooclasesabstractas.form.validador.LargoValidador;
import org.cberetta.pooclasesabstractas.form.validador.Validador;
import org.cberetta.pooclasesabstractas.form.validador.mensaje.IMensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor; //son protected ya que la idea es que sus clases hijas puedan utilizarlos sin necesidad de armar los getters y setters
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this(); //llamo al de arriba para inicializar las listas y demas
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){
        for(Validador validador: this.validadores){
            if(!validador.esValido(this.valor)){
                if(validador instanceof IMensajeFormateable){
                    this.errores.add(((IMensajeFormateable) validador).getMensajeFormateado(nombre));
                } else {
                    this.errores.add(String.format(validador.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty(); //si no hay errores entonces es valido
    }

    abstract public String dibujarHtml(); //los metodos abstractos se indican sin llaves, su implementacion la resolveran las clases hijas


}

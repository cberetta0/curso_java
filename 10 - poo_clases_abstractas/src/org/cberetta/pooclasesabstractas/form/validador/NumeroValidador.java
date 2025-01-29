package org.cberetta.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador {

    protected String mensaje = "el campo %s debe ser un numero";

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        try{
            Integer.parseInt(valor); //si lo puede convertir, es un numero
            return true;
        } catch (NumberFormatException e){
            return  false;
        }
    }
}

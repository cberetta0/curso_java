package org.cberetta.pooclasesabstractas.form.validador;

import org.cberetta.pooclasesabstractas.form.validador.mensaje.IMensajeFormateable;

public class LargoValidador extends Validador implements IMensajeFormateable {

    protected String mensaje = "el campo %s debe tener el minimo %d y maximo %d caracteres"; //%d es del tipo digito, pero tambien podria ser %s (String o cualquier tipo de dato, any)
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        if(valor == null){
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <= max);
    }

    @Override
    public String getMensajeFormateado(String campo){
        //al format primero le paso el mensaje con la plantilla, y luego en orden los valores por los que quiero que reemplace
        return String.format(this.mensaje, campo, this.min, this.max); //reemplazo los valores de mensaje (%s any y %d digito) ya que son variables
    }


}
